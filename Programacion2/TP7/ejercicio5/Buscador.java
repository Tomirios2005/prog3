package ejercicio5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Buscador {
    private ArrayList<Pelicula> peliculas;
    public Buscador(){
        peliculas=new ArrayList<>();
    }
    public void addPelicula(Pelicula pelicula){
        if (!peliculas.contains(pelicula)){
            peliculas.add(pelicula);
        }
    }

    public ArrayList<Pelicula> buscarPeliculas(Condicion cc) {
        ArrayList<Pelicula>retorno=new ArrayList<>();
        for(Pelicula peli:peliculas){
            if (cc.cumple(peli)){
                retorno.add(peli);
            }
        }
        return retorno;
    }
}
