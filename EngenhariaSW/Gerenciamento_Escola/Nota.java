package org.example;

public class Nota {
    private Integer valor;
    private Materia materia;
    private Aluno aluno;

    public Nota(Integer valor, Materia materia, Aluno aluno){
        this.valor = valor;
        this.materia = materia;
        this.aluno = aluno;
    }

    public void setValor(Integer valor){
        this.valor = valor;
    }

    public Integer getValor(){
        return valor;
    }

    public void setMateria(Materia materia){
        this.materia = materia;
    }

    public Materia getMateria(){
        return materia;
    }

    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public Aluno getAluno(){
        return aluno;
    }

}