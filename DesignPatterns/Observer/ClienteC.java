

public class ClienteC implements Observer{
    private String mensagem;
    @Override
    public void atualizar(String mensagem) {
        this.mensagem = mensagem;
        System.out.println("Nova notificacao: " + this.mensagem);
    }
    
}
