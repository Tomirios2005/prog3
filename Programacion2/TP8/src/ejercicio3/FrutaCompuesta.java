package ejercicio3;

public class FrutaCompuesta extends Fruta{
    private Fruta f1;
    private Fruta f2;

    public FrutaCompuesta(Fruta f1, Fruta f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public double getFuerza(Personaje pp) {
        return f1.getFuerza(pp)+f2.getFuerza(pp);
    }
}
