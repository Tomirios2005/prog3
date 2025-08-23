package ejercicio4;

public class CondicionAnd extends Condicion {
    private Condicion c1;
    private Condicion c2;
    public CondicionAnd(Condicion c1, Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return c1.cumple(ficha)&&c2.cumple(ficha);
    }
}
