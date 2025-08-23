package ejercicio4;

public class CondicionDestruccionMayor extends Condicion {
    private int destruccion;

    public CondicionDestruccionMayor(int destruccion) {
        this.destruccion = destruccion;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return this.destruccion< ficha.getPoderDestruccion();
    }
}
