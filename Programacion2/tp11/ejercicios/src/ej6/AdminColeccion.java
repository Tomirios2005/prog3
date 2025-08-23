package ej6;

import ej6.Filtros.Condicion;
import ej6.Filtros.CondicionAlbum;



public class AdminColeccion {


    public static void main(String[] args) {
        ColeccionTematica principal= new ColeccionTematica(false,20);
        Coleccionable f1=new Figurita("mickey", "asd", 5000, 1);
        Coleccionable f4 = new Figurita("goofy", "asd", 3500, 4);
        Coleccionable f5 = new Figurita("pluto", "fgh", 3200, 5);
        Coleccionable f6 = new Figurita("daisy", "vbn", 3700, 6);
        Coleccionable f7 = new Figurita("scrooge", "jkl", 4500, 7);
        Coleccionable f8 = new Figurita("chip", "uio", 2800, 8);
        Coleccionable f9 = new Figurita("dale", "asd", 2900, 9);
        ColeccionTematica secundaria= new ColeccionTematica(false,50);
        secundaria.addColeccionable(f9);
        secundaria.addColeccionable(f8);
        principal.addColeccionable(f1);
        principal.addColeccionable(f4);
        principal.addColeccionable(f5);
        principal.addColeccionable(f6);
        principal.addColeccionable(f7);
        principal.addColeccionable(secundaria);
        Condicion c1=new CondicionAlbum("asd");
        System.out.println(principal.buscar(c1));
        System.out.println(secundaria.getPrecio());




    }
}
