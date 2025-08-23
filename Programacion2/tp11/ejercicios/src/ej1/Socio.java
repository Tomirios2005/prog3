package ej1;

import java.util.ArrayList;

public class Socio implements Comparable<Socio>{
    private String nombre, apellido;
    private int edad;
    private boolean cuotaAlDia;
    private ArrayList<Alquiler>canchas;

    public Socio(String nombre, String apellido, int edad, boolean cuotaAlDia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotaAlDia = cuotaAlDia;
        this.canchas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCuotaAlDia() {
        return cuotaAlDia;
    }

    public void setCuotaAlDia(boolean cuotaAlDia) {
        this.cuotaAlDia = cuotaAlDia;
    }
    public void addCancha(Alquiler cancha){
        canchas.add(cancha);
    }
    public int getCantAlquileres(int nroCancha){
        int contador=0;
        for(Alquiler aa:canchas){
            if (aa.getIdCancha()==nroCancha){
                contador++;
            }
        }
        return contador;
    }
    public boolean alquiloCancha(int nro){
        for (Alquiler aa:canchas){
            if (aa.getIdCancha()==nro){
                return true;
            }
        }
        return false;
    }
    public boolean pago(int precio){
        for (Alquiler aa:canchas){
            if (aa.getPrecio()>precio){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Socio o) {
        if (this.getApellido().compareTo(o.getApellido())!=0){
            return this.getApellido().compareTo(o.getApellido());
        }else{
            return this.getNombre().compareTo(o.getNombre());
        }
    }
    public String toString(){
        return this.nombre;
    }
}
