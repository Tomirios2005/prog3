public class Serie {
    Temporada[] temporadas;
    String titulo, descripcion, creador, genero;
    public Serie(int temporadas, String titulo, String descripcion, String creador, String genero) {
        this.temporadas = new Temporada[temporadas];
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
    }
    
    public int getEpisodiosVistos(){
        int vistos=0;
        for (Temporada temporada : temporadas) {
            vistos+=temporada.getEpisodiosVistos();
            
        }
        return vistos;
    }

    public int getPromedio(){
        int calificacion=0;
        for (Temporada temporada : temporadas) {
            calificacion+=temporada.getPromedio();

            
        }
        return calificacion/temporadas.length;
    }
    public boolean todosFueronVistos(){
        boolean todosVistos=true;
        int temporada=0;
        while (temporada<temporadas.length&&todosVistos) {
            todosVistos=temporadas[temporada].todosFueronVistos();
            temporada++;
            
        }
        return temporada==temporadas.length;
        

    }
    public void addTemporada(int numeroTemporada, Temporada temporada){
        if(numeroTemporada-1<=temporadas.length){
            temporadas[numeroTemporada-1]=temporada;
        }

    }
    public void addCapitulo(int numeroTemporada, int numCapitulo, Episodio episodio){
        if (numeroTemporada-1<=temporadas.length) {
            temporadas[numeroTemporada-1].addCapitulo(numCapitulo-1, episodio);
            
        }


    }

    

    
}
