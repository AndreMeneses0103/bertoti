
public class Main {
    public static void main(String[] args) {
        TimeComponent dev1 = new Individual("Andre", "Dev");
        TimeComponent dev2 = new Individual("Filipe", "Dev");
        TimeComponent tester = new Individual("Pedro", "Tester");

        Time timedev = new Time("Time Desenvolvedores");
        timedev.addMembro(dev1);
        timedev.addMembro(dev2);

        Time timetest = new Time("Time Teste");
        timetest.addMembro(tester);

        Time empresa = new Time("Google");
        empresa.addMembro(timedev);
        empresa.addMembro(timetest);

        empresa.detalhes();
    }
}
