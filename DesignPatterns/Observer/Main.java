

public class Main {
    public static void main(String[] args) {
        Loja lj = new Loja();
        lj.addObs(new ClienteA());
        lj.addObs(new ClienteB());
        lj.addObs(new ClienteC());

        lj.setMensagem("NOVA PROMOCAO");

        lj.notify_all();
    }
}
