

public class ConexaoDatabase {
    private static ConexaoDatabase instancia;

    private ConexaoDatabase(){}

    public static ConexaoDatabase getInstancia(){
        if(instancia == null){
            instancia = new ConexaoDatabase();
        }
        return instancia;
    }

    public void conectar(){
        System.out.println("Conectando ao banco de dados... Instancia: " + this);
    }
}
