package ProgramacionIII.tp5.ejercicio1;

public class Casillero {
    private int valor;
    private boolean norte,sur,este,oeste;

    public Casillero(int valor, boolean norte, boolean sur, boolean este, boolean oeste) {
        this.valor = valor;
        this.norte = norte;
        this.sur = sur;
        this.este = este;
        this.oeste = oeste;
    }

    public int getValor() {
        return valor;
    }

    public boolean isNorte() {
        return norte;
    }

    public boolean isSur() {
        return sur;
    }

    public boolean isOeste() {
        return oeste;
    }

    public boolean isEste() {
        return este;
    }
}
