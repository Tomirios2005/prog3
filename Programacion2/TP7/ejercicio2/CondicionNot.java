package ejercicio2;

public class CondicionNot extends Condicion {
    private final Condicion cc;
    public CondicionNot(Condicion cc) {
        this.cc = cc;
    }
    public boolean cumple(Documento doc){
        return !cc.cumple(doc);
    }
    
}
