
public class Main {
    public static void main(String[] args) {
        ConexaoDatabase conexaoA = ConexaoDatabase.getInstancia();
        conexaoA.conectar();

        ConexaoDatabase conexaoB = ConexaoDatabase.getInstancia();
        conexaoB.conectar();


        if(conexaoA == conexaoB){
            System.out.println("Conexoes A e B sao a mesma instancia.");
        }else{
            System.out.println("Conexao A e B sao diferentes.");
        }
    }
}
