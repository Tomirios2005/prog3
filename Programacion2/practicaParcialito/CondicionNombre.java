public class CondicionNombre extends Condicion{
    private String nombre;

    public CondicionNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Articulo aa) {
        return aa.getNombre().contains(nombre);
    }
}
