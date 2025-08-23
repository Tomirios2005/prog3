package PuertoCereales;

import java.time.LocalDate;

public class Camion{
    private LocalDate fechaCarga;
    public Camion(LocalDate fechaCarga){
        this.fechaCarga=fechaCarga;
    }
    public LocalDate getFechaCarga() {
        return fechaCarga;
    }
    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }
    public boolean tienePrioridad(Camion c){
        return this.getFechaCarga().isBefore(c.getFechaCarga());
    }

    
}
