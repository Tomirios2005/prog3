package parcial2.filtros;

import parcial2.Pieza;

public class CondicionColor extends Condicion{
    private String color;
    public CondicionColor(String color){
        this.color=color;
    }

    @Override
    public boolean cumple(Pieza pp) {
        return pp.getColores().contains(color);
    }
}
