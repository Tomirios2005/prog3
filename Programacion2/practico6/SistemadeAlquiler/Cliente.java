package SistemadeAlquiler;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    private ArrayList <Item> alquileres;
    public Cliente(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
        alquileres=new ArrayList<Item>();
    }
    public void addAlquiler(Item item){
        if (item.alquilable()) {
            alquileres.add(item);

            
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public ArrayList<Item> getAlquileres() {
        return alquileres;
    }
    public String toString(){
        return nombre;
    }
   


}
