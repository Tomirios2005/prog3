package SistemadeAlquiler;

import java.time.LocalDate;

public abstract class Item {
    private LocalDate fechaLimite;
    private int precio;
    
    public Item(LocalDate fechaLimite, int precio) {
        this.fechaLimite = fechaLimite;
        this.precio = precio;

    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public abstract boolean alquilable();

  
    
    



}
