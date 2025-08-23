package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArchivoComprimido extends ArchivoGenerico
{
    private int tasaCompresion;
    private ArrayList<ArchivoGenerico>contenido;
    public ArchivoComprimido(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion, int tasaCompresion) {
        super(nombre, fechaCreacion, fechaModificacion);
        this.tasaCompresion=tasaCompresion;
    }

    @Override
    public double calcularTamanio() {
        double tamanio=0;
        for (ArchivoGenerico aa:contenido){
            tamanio+=aa.calcularTamanio();
        }
        return tamanio/this.tasaCompresion;
    }
}
