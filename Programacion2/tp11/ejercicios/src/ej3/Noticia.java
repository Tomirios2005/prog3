package ej3;

import ej3.filtros.Condicion;

import java.util.ArrayList;

public class Noticia extends Contenido {
    private ArrayList<String>palabrasClave;
    private String intro;
    private String texto;
    private String autor;
    private String link;

    public Noticia(String titulo, String intro, String texto, String autor, String link) {
        super(titulo);
        this.intro = intro;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        palabrasClave=new ArrayList<>();
    }
    public void addPClave(String pp){
        palabrasClave.add(pp);
    }


    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public ArrayList<Contenido> buscar(Condicion cc) {
        ArrayList<Contenido>retorno=new ArrayList<>();
        if (cc.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }
    public boolean tienePalabraClave(String pp){
        return palabrasClave.contains(pp);
    }
}
