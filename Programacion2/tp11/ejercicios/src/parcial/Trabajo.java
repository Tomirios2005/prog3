package parcial;

import parcial.Calculadores.Calculador;
import parcial.filtros.Condicion;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Trabajo {
    private String nombre;

    public Trabajo(String nombre) {
        this.nombre = nombre;
    }
    public abstract boolean necesitaMaterial(String material);
    public abstract int getCantEmpleados();
    public abstract int getTiempo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract ArrayList<Trabajo>buscar(Condicion cc);
    public abstract int getCosto(Calculador calc);
}
