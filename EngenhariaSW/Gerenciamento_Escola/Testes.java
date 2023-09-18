package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes{

    @Test
    public void verificacao() {
        Escola esc = new Escola();
        assertEquals(esc.getNotas().size(), 0);
        esc.adicionarNota(new Nota(8, new Materia("Historia", "Prof Alberto", 32), new Aluno("Jaozim", 15, 1)));
        assertEquals(esc.getNotas().size(), 1);
        esc.adicionarNota(new Nota(6, new Materia("Geografia", "Prof Roberto", 25), new Aluno("Pedrim", 16, 3)));
        esc.adicionarNota(new Nota(9, new Materia("Filosofia", "Prof Marina", 53), new Aluno("Felipim", 15, 5)));
        assertEquals(esc.getNotas().size(), 3);
    }
}
