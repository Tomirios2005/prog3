package ejercicio4;

public class CondicionTamanioMayor extends Condicion{
    private int tamanio;

    public CondicionTamanioMayor(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return this.tamanio< ficha.getTamanio();
    }
}
