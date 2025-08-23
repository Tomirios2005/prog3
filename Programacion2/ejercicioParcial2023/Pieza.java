public abstract class Pieza {
    private String nombre, descripcion;

    public Pieza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public abstract int calcularTiempo();
    public abstract int calcularPLA();

}
