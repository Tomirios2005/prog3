package ej3;


import ej3.filtros.Condicion;
import ej3.filtros.CondicionTopico;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Seccion generales=new Seccion("generales","asd","asd");
        Seccion espectaculos=new Seccion("generales","asd","asd");
        Seccion divorcios=new Seccion("generales","asd","asd");
        Noticia n1= new Noticia("link1","asd","asd","asd","asd");
        generales.addContenido(espectaculos);
        espectaculos.addContenido(divorcios);
        divorcios.addContenido(n1);
        Condicion c1=new CondicionTopico("asd");
        n1.addPClave("asdasd");
        System.out.println(generales.buscar(c1));




    }
}
