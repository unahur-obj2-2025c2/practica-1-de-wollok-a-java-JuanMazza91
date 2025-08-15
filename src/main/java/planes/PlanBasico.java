package planes;

public class PlanBasico implements PlanSuscribible{
    private Integer limite;
    private Double costoBase;

    @Override
    public PlanSuscribible (Integer limite,Double costoBase){
        this.limite = limite;
        this.costoBase = costoBase;
    }

    @Override
    public Double costoPlan(Usuario usuario){
        List<Contenido> contenidoUsuario = usuario.getContenido()
        List<Contenido> excedentes = contenidoUsuario.subList(limite, contenidoUsuario.size());
    if (limite >= contenidoUsuario.size()){
        return costoBase;
    } else {
        return costoBase + excedentes.stream().mapToDouble(c->c.costo);
    }
}
}
