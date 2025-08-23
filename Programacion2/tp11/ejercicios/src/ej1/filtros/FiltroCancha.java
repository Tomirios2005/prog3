package ej1.filtros;

import ej1.Socio;

public class FiltroCancha extends Filtro{
    private int nroCancha;
    public FiltroCancha(int nro){
        this.nroCancha=nro;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.alquiloCancha(nroCancha);
    }
}
