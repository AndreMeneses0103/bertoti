

public class ClienteB implements Observer{
    private String mensagem;
    @Override
    public void atualizar(String mensagem) {
        this.mensagem = mensagem;
        System.out.println("Novo email: " + this.mensagem);
    }
    
}
