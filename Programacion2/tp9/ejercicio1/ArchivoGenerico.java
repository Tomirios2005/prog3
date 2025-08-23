import java.time.LocalDate;

public abstract class ArchivoGenerico {
    private String nombre;
    private LocalDate fecha;

    public ArchivoGenerico(String nombre) {
        this.nombre = nombre;
        this.fecha = LocalDate.now();
    }
    public abstract double getTamanio();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

}
