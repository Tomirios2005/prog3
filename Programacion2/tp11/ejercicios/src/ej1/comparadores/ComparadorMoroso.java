package ej1.comparadores;

import ej1.Socio;

import java.util.Comparator;

public class ComparadorMoroso implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return Boolean.compare(o2.isCuotaAlDia(),o1.isCuotaAlDia());
    }
}
