

import java.util.List;
import java.util.ArrayList;

public class Loja {
    private List<Observer> obs;
    private String mensagem;

    

    public Loja() {
        this.obs = new ArrayList<>();
    }

    public void addObs(Observer obs) {
        this.obs.add(obs);
    }

    public void notify_all(){
        for(Observer b : obs){
            b.atualizar(mensagem);
        }
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
