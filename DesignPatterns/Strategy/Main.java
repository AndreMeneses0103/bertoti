public class Main {
    public static void main(String[] args) {
        Viajante andre = new Viajante();
        andre.setViagem(new Parque());
        andre.viajar();
        andre.setViagem(new Praia());
        andre.viajar();
        andre.setViagem(new Vale());
        andre.viajar();
    }
}
