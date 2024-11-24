
public class ClienteA implements Observer{
    private String mensagem;
    @Override
    public void atualizar(String mensagem) {
        this.mensagem = mensagem;
        System.out.println("Nova mensagem: " + this.mensagem);
    }
    
}
