package ejercicio3;

import java.util.ArrayList;

public class Tripulacion {
    private String nombre;
    private ArrayList<Personaje>personajes;

    public Tripulacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addPersonaje(Personaje pp){
        if (!personajes.contains(pp)){
            personajes.add(pp);
        }
    }
    public double getFuerza(){
        double fuerza=0;
        for(Personaje pp:personajes){
            fuerza+=pp.getFuerza();
        }
        return fuerza;
    }
    public double getPeso(){
        return personajes.getFirst().getPeso();
    }
    public double getEdad(){
        double edad=0;
        for (Personaje pp:personajes){
            if (pp.getEdad()>edad){
                edad=pp.getEdad();
            }

        }
        return edad;
    }
    public int getCantidad(){
        return personajes.size();
    }
}
