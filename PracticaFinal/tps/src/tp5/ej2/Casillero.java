package tp5.ej2;

public class Casillero {
    private boolean norte, sur, este, oeste;
    private int valor;

    public Casillero(boolean norte, boolean sur, boolean este, boolean oeste, int valor) {
        this.norte = norte;
        this.sur = sur;
        this.este = este;
        this.oeste = oeste;
        this.valor=valor;
    }

    public boolean isNorte() {
        return norte;
    }

    public boolean isSur() {
        return sur;
    }

    public boolean isEste() {
        return este;
    }

    public boolean isOeste() {
        return oeste;
    }
    public int getValor() {
        return valor;
    }
}
