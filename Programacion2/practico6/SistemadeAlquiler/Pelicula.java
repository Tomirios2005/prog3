package SistemadeAlquiler;

import java.time.LocalDate;

public class Pelicula extends Item{
    private int copias;
    private String info;
    public Pelicula(LocalDate fechaLimite, int precio, int copias, String info ){
        super(fechaLimite, precio);
        this.copias=copias;
        this.info=info;
    }

    public boolean alquilable(){
        if (copias>0) {
            return true;
            
        }
        return false;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

   
        
    

    
    

}
