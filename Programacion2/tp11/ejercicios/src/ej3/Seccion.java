package ej3;

import ej3.filtros.Condicion;

import java.util.ArrayList;

public class Seccion extends Contenido {
    private ArrayList<Contenido>contenidos;
    private String descripcion, img;

    public Seccion(String titulo,String descripcion, String img) {
        super(titulo);
        this.descripcion = descripcion;
        this.img = img;
        contenidos=new ArrayList<>();
    }
    public void addContenido(Contenido cc){
        contenidos.add(cc);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public ArrayList<Contenido> buscar(Condicion cc) {
        ArrayList<Contenido>retorno=new ArrayList<>();
        for (Contenido cont:contenidos){
            retorno.addAll(cont.buscar(cc));
        }
        return retorno;
    }
}
