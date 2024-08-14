public class Viajante {
    private Viagem vg;

    public void setViagem(Viagem vg){
        this.vg = vg;
    }

    public void viajar(){
        if(vg!= null){
            vg.viajar();
        }else{
            System.out.println("Selecione onde vai viajar");
        }
    }
}
