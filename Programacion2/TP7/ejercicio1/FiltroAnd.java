package ejercicio2;

public class FiltroAnd extends Filtro {
    
    private final Filtro f1;
    private final Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public boolean cumple(ProductoQuimico pq){
        return f1.cumple(pq) && f2.cumple(pq);
    }
}
