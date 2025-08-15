public class Documental extends Contenido{
    private Strin director;
    public Documental(String titulo, Double costoBase){
        super(titulo,costoBase);
        this.director = director;
    }

    @Override
    protected Double doCosto(){
        return Idra.getInstance().getValor();
    }
    /*SINGLETON patron de diseño*/

    public getDirector(){
        return director;
    }
}