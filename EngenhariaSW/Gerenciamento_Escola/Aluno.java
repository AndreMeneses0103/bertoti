package org.example;

public class Aluno {
    private String nome;
    private Integer idade;
    private Integer id;

    public Aluno(String nome, Integer idade, Integer id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
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
}
