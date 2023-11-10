import java.util.LinkedList;
import java.util.List;

public class Escola {

    private List<Materia> materias = new LinkedList<Materia>();

    public void adicionarMateria(Materia materia){
        this.materias.add(materia);
    }

    public List<Materia> consultarMateriaPorProf(String professor){
        List<Materia> materiasSelecionadas = new LinkedList<Materia>();
        for(Materia materia : materias){
            if(materia.getProfessor().equals(professor)){
                materiasSelecionadas.add(materia);
            }
        }
        return materiasSelecionadas;
    }

    public List<Materia> consultarMateriaPorNome(String nome_materia){
        List<Materia> materiasSelecionadas = new LinkedList<Materia>();
        for(Materia materia : materias){
            if(materia.getMateria().equals(nome_materia)){
                materiasSelecionadas.add(materia);
            }
        }
        return materiasSelecionadas;
    }

    public List<Materia> consultarMateriaPorId(Integer id){
        List<Materia> materiasSelecionadas = new LinkedList<Materia>();
        for(Materia materia : materias){
            if(materia.getId().equals(id)){
                materiasSelecionadas.add(materia);
            }
        }
        return materiasSelecionadas;
    }

    public List<Materia> getMaterias(){
        return this.materias;
    }
}
