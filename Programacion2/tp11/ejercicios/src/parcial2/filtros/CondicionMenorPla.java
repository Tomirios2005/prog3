package parcial2.filtros;

import parcial2.Pieza;

public class CondicionMenorPla extends Condicion{
    private int cantPla;
    public CondicionMenorPla(int cantidad){
        cantPla=cantidad;
    }

    @Override
    public boolean cumple(Pieza pp) {
        return pp.getCantPLA()<cantPla;
    }
}
