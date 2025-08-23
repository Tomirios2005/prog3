package ej1.comparadores;

import ej1.Socio;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Comparator<Socio> condicion1, condicion2;

    public ComparadorCompuesto(Comparator<Socio> condicion1, Comparator<Socio> condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        if (condicion1.compare(o1,o2)!=0){
            return condicion1.compare(o1, o2);
        }else {
            return condicion2.compare(o1, o2);
        }
    }
}
