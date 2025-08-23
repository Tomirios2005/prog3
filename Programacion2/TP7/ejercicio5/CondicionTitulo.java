package ejercicio5;

public class CondicionTitulo extends Condicion{
    private String titulo;

    public CondicionTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Pelicula pp) {
        return pp.getTitulo().contains(this.titulo);
    }
}
