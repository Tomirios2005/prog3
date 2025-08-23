package ej6;

import ej6.Filtros.Condicion;

import java.util.ArrayList;

public class Figurita implements Comparable<Figurita>, Coleccionable {
    private String nombre, album;
    private int numero;
    private double precio;

    public Figurita(String nombre, String album, double precio, int numero) {
        this.nombre = nombre;
        this.album = album;
        this.precio = precio;
        this.numero = numero;
    }

    @Override
    public int compareTo(Figurita o) {
        if (Double.compare(this.precio,o.getPrecio())!=0){
            return Double.compare(this.precio, o.getPrecio());
        }else{
            return this.nombre.compareTo(o.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    public boolean esDelAlbum(String aa) {
        return album.equals(aa);
    }

    @Override
    public ArrayList<Figurita> buscar(Condicion cc) {
        ArrayList<Figurita>retorno=new ArrayList<>();
        if (cc.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }
    public String toString(){
        return this.nombre;
    }
}
