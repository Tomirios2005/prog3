package ejercicio3;

public class FrutaFuerzaPeso extends Fruta{
    private int multiplicador;

    public FrutaFuerzaPeso(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public double getFuerza(Personaje pp) {
        return pp.getPeso()*this.multiplicador;
    }
}
