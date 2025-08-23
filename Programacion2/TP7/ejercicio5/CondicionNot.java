package ejercicio5;

public class CondicionNot extends Condicion{
    private Condicion cc;
    public CondicionNot(Condicion cc){
        this.cc=cc;
    }

    @Override
    public boolean cumple(Pelicula pp) {
        return !cc.cumple(pp);
    }
}
