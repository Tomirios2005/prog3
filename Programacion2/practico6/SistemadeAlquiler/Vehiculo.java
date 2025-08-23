package SistemadeAlquiler;

import java.time.LocalDate;

public  class Vehiculo extends Item {
    private String marca, patente, tipo;
    private int kms;
    private boolean alquilado;

    public Vehiculo(LocalDate fechaLimite, int precio, String marca, String patente, int kms, String tipo){
        super(fechaLimite, precio);
        this.marca=marca;
        this.patente=patente;
        this.kms=kms;
        this.alquilado=false;
        this.tipo=tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public int getKms() {
        return kms;
    }
    public void setKms(int kms) {
        this.kms = kms;
    }
    public boolean alquilable(){
        if (alquilado) {
            return false;
            
        }
        return true;
    }
    public boolean isAlquilado() {
        return alquilado;
    }
    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

}
