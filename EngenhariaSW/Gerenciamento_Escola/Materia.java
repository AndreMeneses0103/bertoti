import java.util.LinkedList;
import java.util.List;

public class Materia {
    private String materia;
    private String professor;
    private Integer id;

    private List<Aluno> alunos = new LinkedList<Aluno>();


    public Materia(String materia, String professor, Integer id){
        this.materia = materia;
        this.professor = professor;
        this.id = id;
    }

    public Materia(){

    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
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

    public List<Aluno> consultarAlunosPorNome(String nome){
        List<Aluno> alunoSelecionado = new LinkedList<Aluno>();
        for(Aluno aluno : alunos){
            if(aluno.getNome().equals(nome)){
                alunoSelecionado.add(aluno);
            }
        }
        return alunoSelecionado;
    }

    public List<Aluno> consultarAlunosPorIdade(Integer idade){
        List<Aluno> alunoSelecionado = new LinkedList<Aluno>();
        for(Aluno aluno : alunos){
            if(aluno.getIdade().equals(idade)){
                alunoSelecionado.add(aluno);
            }
        }
        return alunoSelecionado;
    }

    public List<Aluno> consultarAlunosPorId(Integer id){
        List<Aluno> alunoSelecionado = new LinkedList<Aluno>();
        for(Aluno aluno : alunos){
            if(aluno.getId().equals(id)){
                alunoSelecionado.add(aluno);
            }
        }
        return alunoSelecionado;
    }

    public List<Aluno> getAlunos(){
        return this.alunos;
    }
}