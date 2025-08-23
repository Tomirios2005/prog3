package ej1.comparadores;

import ej1.Socio;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Socio> {
    public int compare(Socio o1, Socio o2){
        return o1.getEdad()-o2.getEdad();
    }

}
