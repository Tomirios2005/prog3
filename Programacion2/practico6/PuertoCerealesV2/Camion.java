package PuertoCerealesV2;

import java.time.LocalDate;

public class Camion extends Vehiculo{
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
    public boolean tienePrioridad(Vehiculo c){
        if (equals(c)) {
            Camion c1 = (Camion) c;
            return this.getFechaCarga().isBefore(c1.getFechaCarga());

            
        }
        return false;
    }
    public boolean equals(Object o){
        if (o instanceof Camion) {
            return true;
            
        }
        return false;
    }

    
}
