package ej3;

import ej3.filtros.Condicion;

import java.util.ArrayList;

public abstract class Contenido {
    private String titulo;

    public Contenido(String titulo) {
        this.titulo = titulo;
    }

    public abstract ArrayList<Contenido>buscar(Condicion cc);

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
