package ejercicio3;

public class FrutaFuerzaFija extends Fruta {
    private double fuerza;

    public FrutaFuerzaFija(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getFuerza(Personaje pp) {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

}
