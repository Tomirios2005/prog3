package ejercicio3;

public class CondicionAnd extends Condicion {
    private final Condicion c1;
    private final Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Planta pp) {
        return c1.cumple(pp)&&c2.cumple(pp);
    }
}
