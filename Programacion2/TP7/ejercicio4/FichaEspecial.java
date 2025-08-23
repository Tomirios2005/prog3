package ejercicio4;

public class FichaEspecial extends Ficha{
    public FichaEspecial(int fortaleza, int tamanio) {
        super(fortaleza, tamanio, 0);
    }

    @Override
    public int getPoderDestruccion() {
        return this.getFortaleza()/this.getTamanio();
    }
}
