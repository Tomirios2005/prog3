package ejercicio3;

public class CondicionNot extends Condicion{
    private final Condicion cc;

    public CondicionNot(Condicion cc) {
        this.cc = cc;
    }

    @Override
    public boolean cumple(Planta pp) {
        return !cc.cumple(pp);
    }
}
