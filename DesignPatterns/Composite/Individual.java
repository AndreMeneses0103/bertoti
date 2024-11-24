
public class Individual implements TimeComponent{
    private String nome;
    private String funcao;

    public Individual(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    @Override
    public void detalhes() {
        System.out.println(String.format("Nome: %s, Funcao: %s", nome, funcao));
    }
    
}
