public class Archivo extends ArchivoGenerico{
    private double tamanio;
    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio=tamanio;
    }

    @Override
    public double getTamanio() {
        return this.tamanio;
    }
}
