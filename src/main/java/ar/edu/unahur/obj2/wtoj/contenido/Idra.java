public class Idra{
    private static Idra intance = new Idra()
    private Idra(){} // constructor anulado
    private Double valor = 0.5;
    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public static Idra getInstance(){
        return instance;
    }
}