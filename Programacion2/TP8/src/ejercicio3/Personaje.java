package ejercicio3;

import java.util.ArrayList;

public class Personaje {
    private String nombre;
    private int edad;
    private double peso;
    private double fuerza=125;
    private ArrayList<Fruta>frutas;

    public Personaje(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.frutas=new ArrayList<>();
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFuerza() {
        double fuerza=this.fuerza;
        if (frutas.isEmpty()){
            return fuerza;
        }
        for(Fruta f:frutas){
            fuerza+=f.getFuerza(this);
        }
        return fuerza;

    }
    public void addFrutas(Fruta fruta){
        frutas.add(fruta);
    }



}
