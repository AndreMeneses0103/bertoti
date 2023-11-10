public class Nota {
    private Integer valor;

    public Nota(Integer valor){
        if(!(valor < 0 || valor > 10)){
            this.valor = valor;
        }
    }

    public Nota(){

    }

    public void setValor(Integer valor){
        if(!(valor < 0 || valor > 10)){
            this.valor = valor;
        }
    }

    public Integer getValor(){
        return valor;
    }

}