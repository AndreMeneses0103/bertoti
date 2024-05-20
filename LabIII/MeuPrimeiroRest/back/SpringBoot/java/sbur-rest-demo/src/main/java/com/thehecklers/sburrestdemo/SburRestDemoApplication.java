package com.thehecklers.sburrestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class SburRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
class RestApiDemoController {
	private List<Produto> produtos = new ArrayList<>();

	public RestApiDemoController() {
		produtos.addAll(List.of(
				new Produto("Shampoo", 10),
				new Produto("Condicionador", 30),
				new Produto("Pente"),
				new Produto("Sabonete", 2)
		));
	}

	@GetMapping
	Iterable<Produto> getProducts() {
		return produtos;
	}

	@GetMapping("/{id}")
	Optional<Produto> getProductById(@PathVariable String id) {
		for (Produto p: produtos) {
			if (p.getId().equals(id)) {
				return Optional.of(p);
			}
		}

		return Optional.empty();
	}

	@PostMapping
	Produto postProduct(@RequestBody Produto prod) {
		if (prod.getId() == null || prod.getId().isEmpty()) {
			prod.setId(UUID.randomUUID().toString());
		}
		produtos.add(prod);
		return prod;
	}

	@PutMapping("/{id}")
	ResponseEntity<Produto> putProduct(@PathVariable String id,@RequestBody Produto prod) {
		int productIndex = -1;

		for (Produto p: produtos) {
			if (p.getId().equals(id)) {
				productIndex = produtos.indexOf(p);
				prod.setId(id);
				produtos.set(productIndex, prod);
			}
		}

		return (productIndex == -1) ?
				new ResponseEntity<>(postProduct(prod), HttpStatus.CREATED) :
				new ResponseEntity<>(prod, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteProduct(@PathVariable String id) {
		produtos.removeIf(p -> p.getId().equals(id));
	}
}

class Produto {
	private String id;
	private String name;
	private Integer quantity;

	public Produto() {
	}
	public Produto(String name, String id, Integer quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	public Produto(String name) {
		this.name = name;
		this.id = UUID.randomUUID().toString();
		this.quantity = 0;
	}

	public Produto(String name, Integer quantity) {
		this.name = name;
		this.id = UUID.randomUUID().toString();
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getQuantity(){return quantity;}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id){this.id = id;}

	public void setQuantity(Integer quantity){this.quantity = quantity;}
}