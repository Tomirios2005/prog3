package ej6;

import ej6.Filtros.Condicion;

import java.util.ArrayList;

public interface Coleccionable {
    double getPrecio();
    ArrayList<Figurita>buscar(Condicion cc);

}
