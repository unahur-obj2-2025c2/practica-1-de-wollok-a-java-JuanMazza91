public class Usuario {
    private  PlanSuscribible plan;
    private List<Contenido> contenido = new ArrayList<>();

    public class Usuario(PlanSuscribible plan,  List<Contenido> contenido){
        ...
    }

    public void verContenido(Contenido unContenido){
        contenido.add(unContenido)
    }
}
