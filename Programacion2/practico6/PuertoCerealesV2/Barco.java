package PuertoCerealesV2;

public class Barco extends Vehiculo {
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
    public boolean tienePrioridad(Vehiculo b){
        if (b instanceof Barco) {
            Barco b1 = (Barco)b;
            return this.getCapacidad()>b1.getCapacidad();

            
        }
        return false;
    }
    
    
}
