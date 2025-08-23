package parcial2;

import parcial2.filtros.Condicion;

import java.util.ArrayList;

public abstract class Pieza {
    private String nombre, descripcion;
    private static int precioImpresion=10;
    private static int precioPLA=50;

    public Pieza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public abstract int getCantPLA();
    public abstract int getTiempo();
    public abstract ArrayList<Pieza>buscar(Condicion cc);
    public abstract ArrayList<String>getColores();

    public static int getPrecioImpresion() {
        return precioImpresion;
    }

    public static void setPrecioImpresion(int precioImpresion) {
        Pieza.precioImpresion = precioImpresion;
    }
    public int calcPrecio(){
        return this.getCantPLA()*precioPLA+precioImpresion*this.getTiempo();
    }
}
