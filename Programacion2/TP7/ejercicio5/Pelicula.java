package ejercicio5;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinopsis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList <String> actores;
    private int anioEstreno;
    private int duracion;
    private int edadMinima;

    public Pelicula(String titulo, String sinopsis, String director, int anioEstreno, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        generos=new ArrayList<>();
        actores=new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    public void addGeneros(String genero){
        if (!generos.contains(genero)){
            generos.add(genero);
        }
    }
    public void addActores(String actor){
        if (!actores.contains(actor)){
            actores.add(actor);
        }
    }
    public boolean tieneGenero(String genero){
        return this.generos.contains(genero);
    }
    public boolean tieneActor(String actor){
        return this.actores.contains(actor);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Pelicula pp = (Pelicula)obj;
            if (this.getTitulo().equals(pp.getTitulo())&&this.getDirector().equals(pp.getTitulo())){
                return true;
            }else{
                return false;

            }

        } catch (Exception e) {
            return false;
        }
    }
    public boolean EsRentable(Condicion cc){
        return cc.cumple(this);
    }
}
