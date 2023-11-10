import java.util.LinkedList;
import java.util.List;

public class Aluno {
    private String nome;
    private Integer idade;
    private Integer id;

    private List<Nota> notas = new LinkedList<Nota>();

    public Aluno(String nome, Integer idade, Integer id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Aluno(){

    }

    public void adicionarNota(Nota nota){
        if(!(nota.getValor() == null)){
            this.notas.add(nota);
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Integer getIdade(){
        return idade;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public List<Nota> getNotas(){
        return this.notas;
    }

    public Integer getMedia(){
        Integer media = 0;
        for(Nota nota : notas){
            media += nota.getValor();
        }
        media = media/notas.size();
        return media;
    }
}
