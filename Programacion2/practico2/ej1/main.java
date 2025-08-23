public class main {
    public static void main(String[] args) {
        Serie riverdale = new Serie(2, "Riverdale", "serie sobre misterio", "anonimo", "suspenso");
        riverdale.addTemporada(1, new Temporada(10, 1));
        riverdale.addTemporada(2, new Temporada(10, 2));
        riverdale.addCapitulo(1, 1, new Episodio("Piloto", "null"));

    }
    
}
