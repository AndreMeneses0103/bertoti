var produto;
var quantidade;

window.onload = () => {
    loadTable();

    document.getElementById("create_btn").addEventListener("click", () => {
        Swal.fire({
            title: "Digite o nome do produto",
            input: "text",
            inputPlaceholder: "Nome do produto",
            showCancelButton: true,
            inputValidator: (value) => {
                if (!value) {
                    return "Voce precisa escrever algo!";
                }
            },
        }).then((result) => {
            if (result.isConfirmed) {
                produto = result.value;
                Swal.fire({
                    title: "Digite a quantidade",
                    input: "number",
                    inputPlaceholder: "Quantidade",
                    showCancelButton: true,
                    inputValidator: (value) => {
                        if (!value) {
                            return "Voce precisa escrever algo!";
                        }
                    },
                }).then((result) => {
                    if (result.isConfirmed) {
                        quantidade = result.value;
                        Swal.fire(`Produto Cadastrado com sucesso!`);
                        createProduct();
                    }
                });
            }
        });
    });
};

function loadTable() {
    fetch("http://localhost:8080/products")
        .then((response) => {
            if (!response.ok) {
                throw new Error("Erro ao fazer a solicitação");
            }
            return response.json();
        })
        .then((data) => {
            console.log(data);
            var table = document.getElementById("tb");
            table.innerHTML = "";
            for (let x = 0; x < data.length; x++) {
                let newRow = document.createElement("tr");
                if (x % 2 == 0) {
                    newRow.className = "row";
                } else {
                    newRow.className = "row2";
                }

                let cell1 = document.createElement("th");
                cell1.classList = "table_item";
                cell1.textContent = x + 1;

                let cell2 = document.createElement("th");
                cell2.classList = "table_item";
                cell2.textContent = data[x].name;

                let cell3 = document.createElement("th");
                cell3.classList = "table_item";
                cell3.textContent = data[x].quantity;

                let cell4 = document.createElement("th");
                cell4.classList = "table_item";
                cell4.textContent = data[x].id;

                let cell5 = document.createElement("th");
                cell5.classList = "table_item";
                cell5.id = "cell_btns";
                let btnDelete = document.createElement("button");
                btnDelete.textContent = "Deletar";
                btnDelete.id = `del${x + 1}`;
                btnDelete.className = "button red";
                let btnUpdate = document.createElement("button");
                btnUpdate.textContent = "Atualizar";
                btnUpdate.id = `up${x + 1}`;
                btnUpdate.className = "button green";
                btnUpdate.style.marginRight = "10px";

                btnDelete.addEventListener("click", () => {
                    deletarLinha(data[x].id)
                        .then(() => {
                            Swal.fire("Deletado com sucesso!");
                            loadTable();
                        })
                        .catch((error) => {
                            console.error("Erro ao deletar:", error);
                        });
                });

                btnUpdate.addEventListener("click", () => {
                    transformToInputs(newRow, data[x], x + 1);
                });

                cell5.appendChild(btnUpdate);
                cell5.appendChild(btnDelete);

                newRow.appendChild(cell1);
                newRow.appendChild(cell2);
                newRow.appendChild(cell3);
                newRow.appendChild(cell4);
                newRow.appendChild(cell5);

                table.appendChild(newRow);
            }
        })
        .catch((error) => {
            console.error("Ocorreu um erro:", error);
        });
}

document.getElementById("btn").onclick = () => {
    var table = document.getElementById("tb");
    var newRow = document.createElement("tr");

    var cell1 = document.createElement("th");
    newRow.className = "row";
    cell1.classList = "table_item";
    cell1.textContent = "Hello!!!";

    newRow.appendChild(cell1);
    table.appendChild(newRow);
};

function deletarLinha(id) {
    return fetch(`http://localhost:8080/products/${id}`, {
        method: "DELETE",
    })
        .then((response) => {
            if (!response.ok) {
                throw new Error("Erro ao deletar");
            } else {
                return { success: true };
            }
        })
        .catch((error) => {
            console.error(error);
            throw error;
        });
}

function transformToInputs(row, data, rowNum) {
    row.innerHTML = "";

    let cell1 = document.createElement("th");
    cell1.classList = "table_item";
    cell1.textContent = rowNum;

    let cell2 = document.createElement("th");
    let inputName = document.createElement("input");
    inputName.classList = "table_item";
    inputName.className = "input_change";
    inputName.type = "text";
    inputName.value = data.name;
    cell2.appendChild(inputName);

    let cell3 = document.createElement("th");
    let inputQuantity = document.createElement("input");
    inputQuantity.classList = "table_item";
    inputQuantity.className = "input_change";
    inputQuantity.type = "number";
    inputQuantity.value = data.quantity;
    cell3.appendChild(inputQuantity);

    let cell4 = document.createElement("th");
    cell4.classList = "table_item";
    cell4.textContent = data.id;

    let cell5 = document.createElement("th");
    cell5.classList = "table_item";
    cell5.id = "cell_btns";
    let btnSave = document.createElement("button");
    btnSave.textContent = "Salvar";
    btnSave.className = "button dark-blue"
    btnSave.style.marginRight = "10px";
    btnSave.addEventListener("click", () => {
        saveUpdate(data.id, inputName.value, inputQuantity.value);
    });
    let btnCancel = document.createElement("button");
    btnCancel.textContent = "Cancelar";
    btnCancel.className = "button dark-blue";
    btnCancel.addEventListener("click", () => {
        loadTable();
    });
    cell5.appendChild(btnSave);
    cell5.appendChild(btnCancel);

    row.appendChild(cell1);
    row.appendChild(cell2);
    row.appendChild(cell3);
    row.appendChild(cell4);
    row.appendChild(cell5);
}

function saveUpdate(id, name, quantity) {
    fetch(`http://localhost:8080/products/${id}`, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify({
            id: id,
            name: name,
            quantity: quantity,
        }),
    })
        .then((response) => {
            if (!response.ok) {
                throw new Error("Erro ao atualizar o produto");
            }
            Swal.fire("Atualizado com sucesso!");
            loadTable();
        })
        .catch((error) => {
            console.error("Erro ao atualizar:", error);
        });
}

async function createProduct(){
    try{
        let dados = {
            name: produto,
            quantity: quantidade
        }
        let req = await fetch("http://localhost:8080/products", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(dados)
        });

        if(req.ok){
            Swal.fire("Produto cadastrado com sucesso!");
            loadTable();
        }
    }catch(err){
        console.error(err);
        Swal.fire({
            icon: 'error',
            title: 'Erro!',
            text: 'Algo de errado aconteceu...'
        });
    }
}
