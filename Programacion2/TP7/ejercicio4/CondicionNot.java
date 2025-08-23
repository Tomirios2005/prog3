package ejercicio4;

public class CondicionNot extends Condicion{
    private Condicion condicion;
    public CondicionNot(Condicion cc){
        condicion=cc;
    }
    public boolean cumple(Ficha ficha){
        return !condicion.cumple(ficha);
    }
}
