package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends ArchivoGenerico{
    private ArrayList<ArchivoGenerico>contenido;
    public Directorio(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion) {
        super(nombre, fechaCreacion, fechaModificacion);
    }

    @Override
    public double calcularTamanio() {
        double tamanio=0;
        for(ArchivoGenerico archivo:contenido){
            tamanio+=archivo.calcularTamanio();

        }
        return tamanio;
    }
    public int getCantElementos(){
        return contenido.size();
    }
}
