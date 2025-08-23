public class Link extends ArchivoGenerico{
    private ArchivoGenerico objetivo;

    public Link(String nombre, ArchivoGenerico objetivo) {
        super(nombre);
        this.objetivo = objetivo;
    }

    @Override
    public double getTamanio() {
        return 1;
    }
}
