fetch('http://localhost:8080/products')
    .then((response) => {
        // Verifica se a resposta da solicitação é bem-sucedida
        if (!response.ok) {
            throw new Error("Erro ao fazer a solicitação");
        }
        // Converte a resposta em JSON
        return response.json();
    })
    .then((data) => {
        // Manipula os dados recebidos
        console.log(data);
        var table = document.getElementById("tb");
        for(let x = 0; x < data.length; x++){
            var newRow = document.createElement("tr");
            if(x%2 == 0){
                newRow.className = "row";
            }else{
                newRow.className = "row2";
            }
    
            var cell1 = document.createElement("th");
            cell1.classList = "table_item";
            cell1.textContent = x+1;
    
            var cell2 = document.createElement("th");
            cell2.classList = "table_item";
            cell2.textContent = data[x].name;
            var cell3 = document.createElement("th");
            cell3.classList = "table_item";
            cell3.textContent = data[x].quantity;
    
            var cell4 = document.createElement("th");
            cell4.classList = "table_item";
            cell4.textContent = data[x].id;
    
            newRow.appendChild(cell1);
            newRow.appendChild(cell2);
            newRow.appendChild(cell3);
            newRow.appendChild(cell4);

            table.appendChild(newRow);
        }
    })
    .catch((error) => {
        // Manipula erros
        console.error("Ocorreu um erro:", error);
    });

document.getElementById("btn").onclick = () => {
    var table = document.getElementById("tb");
    var newRow = document.createElement("tr");

    var cell1 = document.createElement("th");
    newRow.className = "row";
    cell1.classList = "table_item";
    cell1.textContent = "Hello!!!";

    var final = document.getElementById("final");

    newRow.appendChild(cell1);
    table.appendChild(newRow);
};
