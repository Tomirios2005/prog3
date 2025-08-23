package ejercicio1;

import java.time.LocalDate;

public abstract class ArchivoGenerico {
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;

    public ArchivoGenerico(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public abstract double calcularTamanio();

}
