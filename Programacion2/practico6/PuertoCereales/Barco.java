package PuertoCereales;

public class Barco {
    private int capacidad;
    public Barco(int capacidad){
        this.capacidad=capacidad;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public boolean tienePrioridad(Barco b){
        return this.getCapacidad()>b.getCapacidad();
    }
    
    
}
