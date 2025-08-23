package ej1;

import java.time.LocalDate;

public class Alquiler {
    private int idCancha;
    private LocalDate fecha;
    private int precio;

    public Alquiler(int idCancha, LocalDate fecha, int precio) {
        this.idCancha = idCancha;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
