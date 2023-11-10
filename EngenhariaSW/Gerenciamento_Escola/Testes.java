import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Testes {

    //TESTES COM MATERIA
    @Test
    public void testMateriaValidaNome(){
        Escola escola = new Escola();
        Materia mat = new Materia("Matematica", "Gilberto", 21);
        escola.adicionarMateria(mat);

        List<Materia> res = escola.consultarMateriaPorNome("Matematica");

        assertEquals(res.size(), 1);
        assertTrue(res.contains(mat));
    }

    @Test
    public void testMateriaInvalidaNome(){
        Escola escola = new Escola();
        Materia mat = new Materia("Matematica", "Gilberto", 21);
        escola.adicionarMateria(mat);

        List<Materia> res = escola.consultarMateriaPorNome("Portugues");

        assertEquals(res.size(), 0);
        assertFalse(res.contains(mat));
    }

    @Test
    public void testMateriaValidaId(){
        Escola escola = new Escola();
        Materia mat = new Materia("Matematica", "Gilberto", 21);
        escola.adicionarMateria(mat);

        List<Materia> res = escola.consultarMateriaPorId(21);

        assertEquals(res.size(), 1);
        assertTrue(res.contains(mat));
    }

    @Test
    public void testMateriaInvalidaId(){
        Escola escola = new Escola();
        Materia mat = new Materia("Matematica", "Gilberto", 21);
        escola.adicionarMateria(mat);

        List<Materia> res = escola.consultarMateriaPorId(78);

        assertEquals(res.size(), 0);
        assertFalse(res.contains(mat));
    }

    @Test
    public void testMateriaValidaProf(){
        Escola escola = new Escola();
        Materia mat = new Materia("Matematica", "Gilberto", 21);
        escola.adicionarMateria(mat);

        List<Materia> res = escola.consultarMateriaPorProf("Gilberto");

        assertEquals(res.size(), 1);
        assertTrue(res.contains(mat));
    }

    @Test
    public void testMateriaInvalidaProf(){
        Escola escola = new Escola();
        Materia mat = new Materia("Matematica", "Gilberto", 21);
        escola.adicionarMateria(mat);

        List<Materia> res = escola.consultarMateriaPorProf("Pedro");

        assertEquals(res.size(), 0);
        assertFalse(res.contains(mat));
    }

    //--------------
    //TESTES COM ALUNO

    @Test
    public void testAlunoValidoIdade(){
        Materia materia = new Materia();
        Aluno al = new Aluno("Ronaldo", 15, 87);
        materia.adicionarAluno(al);

        List<Aluno> res = materia.consultarAlunosPorIdade(15);

        assertEquals(res.size(), 1);
        assertTrue(res.contains(al));
    }

    @Test
    public void testAlunoInvalidoIdade(){
        Materia materia = new Materia();
        Aluno al = new Aluno("Ronaldo", 15, 87);
        materia.adicionarAluno(al);

        List<Aluno> res = materia.consultarAlunosPorIdade(12);

        assertEquals(res.size(), 0);
        assertFalse(res.contains(al));
    }

    @Test
    public void testAlunoValidoId(){
        Materia materia = new Materia();
        Aluno al = new Aluno("Ronaldo", 15, 87);
        materia.adicionarAluno(al);

        List<Aluno> res = materia.consultarAlunosPorId(87);

        assertEquals(res.size(), 1);
        assertTrue(res.contains(al));
    }

    @Test
    public void testAlunoInvalidoId(){
        Materia materia = new Materia();
        Aluno al = new Aluno("Ronaldo", 15, 87);
        materia.adicionarAluno(al);

        List<Aluno> res = materia.consultarAlunosPorId(50);

        assertEquals(res.size(), 0);
        assertFalse(res.contains(al));
    }

    @Test
    public void testAlunoValidoNome(){
        Materia materia = new Materia();
        Aluno al = new Aluno("Ronaldo", 15, 87);
        materia.adicionarAluno(al);

        List<Aluno> res = materia.consultarAlunosPorNome("Ronaldo");

        assertEquals(res.size(), 1);
        assertTrue(res.contains(al));
    }

    @Test
    public void testAlunoInvalidoNome(){
        Materia materia = new Materia();
        Aluno al = new Aluno("Ronaldo", 15, 87);
        materia.adicionarAluno(al);

        List<Aluno> res = materia.consultarAlunosPorNome("Maria");

        assertEquals(res.size(), 0);
        assertFalse(res.contains(al));
    }

    //--------------
    //TESTES COM NOTAS

    @Test
    public void testNotaValida(){
        Aluno aluno = new Aluno();
        Nota n = new Nota(8);
        aluno.adicionarNota(n);

        List<Nota> res = aluno.getNotas();

        assertEquals(res.size(), 1);
        assertTrue(res.contains(n));
    }

    @Test
    public void testNotaInvalida(){
        Aluno aluno = new Aluno();
        Nota n = new Nota(13);
        aluno.adicionarNota(n);

        List<Nota> res = aluno.getNotas();

        assertEquals(res.size(), 0);
        assertFalse(res.contains(n));
    }

    @Test
    public void testMediaValida(){
        Aluno aluno = new Aluno();
        Nota n = new Nota(8);
        Nota m = new Nota(6);
        Nota o = new Nota(10);
        aluno.adicionarNota(n);
        aluno.adicionarNota(m);
        aluno.adicionarNota(o);

        Integer res = aluno.getMedia();

        assertEquals(res, 8);
    }

    @Test
    public void testMediaInvalida(){
        Aluno aluno = new Aluno();
        Nota n = new Nota(8);
        Nota m = new Nota(6);
        Nota o = new Nota(10);
        aluno.adicionarNota(n);
        aluno.adicionarNota(m);
        aluno.adicionarNota(o);

        Integer res = aluno.getMedia();

        assertNotEquals(res, 4);
    }
}
