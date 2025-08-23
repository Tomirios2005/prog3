public class CondicionNot extends Condicion{
    private Condicion cc;

    public CondicionNot(Condicion cc) {
        this.cc = cc;
    }

    @Override
    public boolean cumple(ArchivoGenerico aa) {
        return !cc.cumple(aa);
    }
}
