package ej1.filtros;

import ej1.Socio;

public class FIltroCuota extends Filtro{
    @Override
    public boolean cumple(Socio socio) {
        return socio.isCuotaAlDia();
    }
}
