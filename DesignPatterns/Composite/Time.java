
import java.util.ArrayList;
import java.util.List;

public class Time implements TimeComponent{
    private String nome;
    private List<TimeComponent> membros = new ArrayList<>();

    public Time(String nome){
        this.nome = nome;
    }

    public void addMembro(TimeComponent membro){
        membros.add(membro);
        System.out.println("Membro adicionado: " +nome);
    }

    public void removeMembro(TimeComponent membro){
        membros.remove(membro);
        System.out.println("Membro removido: " + nome);
    }


    @Override
    public void detalhes() {
        System.out.println("Time: " + nome);
        for(TimeComponent membro : membros){
            membro.detalhes();
        }
    }
    
}
