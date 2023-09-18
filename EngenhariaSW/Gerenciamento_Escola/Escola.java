package org.example;

import java.util.LinkedList;
import java.util.List;

public class Escola {
    private List<Nota> notas = new LinkedList<Nota>();

    public void adicionarNota(Nota nota){
        notas.add(nota);
    }

    public List<Nota> consultarNotaPorMateria(String materia){
        List<Nota> notasEncontradas = new LinkedList<Nota>();
        for(Nota nota:notas){
            if(nota.getMateria().equals(materia)){
                notasEncontradas.add(nota);
            }
        }
        return notasEncontradas;
    }

    public List<Nota> consultarNotaPorAluno(String aluno){
        List<Nota> notasEncontradas = new LinkedList<Nota>();
        for(Nota nota:notas){
            if(nota.getAluno().equals(aluno)){
                notasEncontradas.add(nota);
            }
        }
        return notasEncontradas;
    }

    public List<Nota> getNotas(){
        return notas;
    }
}
