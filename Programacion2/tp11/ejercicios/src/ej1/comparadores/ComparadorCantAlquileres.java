package ej1.comparadores;

import ej1.Socio;

import java.util.Comparator;

public class ComparadorCantAlquileres implements Comparator<Socio> {
    private int nroCancha;

    public ComparadorCantAlquileres(int nroCancha) {
        this.nroCancha = nroCancha;
    }


    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getCantAlquileres(nroCancha)-o2.getCantAlquileres(nroCancha);
    }
}
