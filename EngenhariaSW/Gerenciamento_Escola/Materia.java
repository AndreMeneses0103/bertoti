package org.example;

public class Materia {
    private String materia;
    private String professor;
    private Integer id;

    public Materia(String materia, String professor, Integer id){
        this.materia = materia;
        this.professor = professor;
        this.id = id;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }

    public void setProfessor(String professor){
        this.professor = professor;
    }

    public String getProfessor(){
        return professor;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
}