package ProgramacionIII.tp3;

import ProgramacionIII.tp4.Arco;
import ProgramacionIII.tp4.GrafoNoDirigido;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
//        Dado el conjunto de elementos: X= {68, 42, 47, 5, 76, 95, 23, 88, 90, 85, 31, 71, 60, 10, 46, 61,
//                50, 92, 74, 6, 97, 66, 1, 56, 27, 7, 14, 92} Realizar la inserción de los mismos en una estructura
//        de Hashing com la que se especifica en cada punto, con las siguientes técnicas de
//        tratamiento de desbordes, muestre gráficamente cómo se va armando la estructura y cómo
//        queda luego de insertar hasta el último elemento:
//        a.- Hashing separado (con M=7 y rp=1, rs=1).
//                b.- Hashing separado con crecimiento (con el comportamiento de HashTable de JAVA) (con
//        M=7, ρd=0,9).

        GrafoNoDirigido<Integer>rutas=new GrafoNoDirigido<>();
        rutas.agregarArco(1, 2, 10);
        rutas.agregarArco(1, 3, 15);
        rutas.agregarArco(2, 3, 5);
        rutas.agregarArco(2, 4, 12);
        rutas.agregarArco(3, 5, 10);
        rutas.agregarArco(4, 5, 2);
        rutas.agregarArco(4, 6, 8);
        rutas.agregarArco(5, 6, 5);




    }





}
