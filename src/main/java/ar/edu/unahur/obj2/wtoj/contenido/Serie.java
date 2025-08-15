public class Serie extends Contenido{
    public Serie(String titulo, Double costoBase){
       
        private List<Temporada> temporadas = new ArrayList<>();

        public Serie (String titulo, Double costoBase, List<Temporada> temporadas){
         super(titulo,costoBase);
         this.temporadas = temporadas;
         }

        public Serie (String titulo, Double costoBase){
            super(titulo,costoBase);
        }

        public void agregarTemporada(Temporada unaTemporada){
            temporadas.add(unaTemporada);
        }

          @Override
    protected Double doCosto(){
        return temporadas.stream().mapToDouble(t->t.costo()).average().orElse(0.0);
    }
    }
}