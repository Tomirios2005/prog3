package ejercicio2;

public class CondicionAnd {
    private final Condicion condicion1;
    private final Condicion condicion2;

    public CondicionAnd(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    public boolean cumple(Documento dd){
        return condicion1.cumple(dd)&&condicion2.cumple(dd);

    }
    
}
