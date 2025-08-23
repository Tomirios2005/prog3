public class Temporada {
    Episodio [] episodios;
    int numero;

    public Temporada(int cantEpisodios, int numero) {
        this.episodios = new Episodio[cantEpisodios];
        this.numero = numero;
    }
    public int getEpisodiosVistos(){
        int vistos=0;
        for (Episodio episodio : episodios) {
            if (episodio.fueVisto()) {
                vistos++;
                
            }
            
        }
        return vistos;


    }
    public int getPromedio(){
        int calificacion=0;
        for (Episodio episodio : episodios) {
            if (episodio.fueVisto()) {
                calificacion+=episodio.getCalificacion();
                
            }
            
        }
        return calificacion/this.getEpisodiosVistos();
    }
    public boolean todosFueronVistos(){
        int capitulo=0;
        boolean fueVisto=true;
        while (capitulo<episodios.length&&fueVisto) {
            fueVisto=episodios[capitulo].fueVisto();
            capitulo++;
            
        }
        return capitulo==episodios.length;
    }
    public void addCapitulo(int numCapitulo, Episodio episodio){
        if (numCapitulo<=episodios.length) {
            episodios[numCapitulo]=episodio;
            
        }
    }



    
}
