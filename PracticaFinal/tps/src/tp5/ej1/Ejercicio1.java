package tp5.ej1;

import tp4.Grafo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio1 {
//    Se tiene un conjunto de salas comunicadas entre sí a través de puertas que se abren solamente en
//    un sentido. Una de las salas se denomina entrada y la otra salida. Construir un algoritmo que
//    permita ir desde la entrada a la salida atravesando la máxima cantidad de salas. Idea: podría
//    representar el problema mediante un grafo dirigido, donde cada nodo es una habitación, y cada
//    puerta es un arco dirigido hacia otra habitación.

    //empezas desde la entrada, si la actual es la salida y la longitud es mayor que la mejorSolucion la agregas a la solucion
    //global

    private Grafo<Integer> salas;
    private ArrayList<Integer> mejorSolucion;

    public Ejercicio1(Grafo<Integer> salas) {
        this.salas = salas;
        this.mejorSolucion = new ArrayList<>();
    }
    public void encontrarCaminoLargo(Integer entrada, Integer salida){
        ArrayList<Integer>caminoActual = new ArrayList<>();
        HashSet<Integer>visitados = new HashSet<>();
        visitados.add(entrada);
        caminoActual.add(entrada);

        backtrack(entrada, caminoActual, visitados, salida);
    }
    private void backtrack(Integer actual, ArrayList<Integer>caminoActual, HashSet<Integer>visitados, Integer salida){
        if (caminoActual.size()>mejorSolucion.size()&&actual.equals(salida)) {
           mejorSolucion.clear();;
           mejorSolucion.addAll(caminoActual);
        }else{
            Iterator<Integer> adyacentes=this.salas.obtenerAdyacentes(actual);
            while (adyacentes.hasNext()){
                int ady=adyacentes.next();
                if (!visitados.contains(ady)){
                    visitados.add(ady);
                    caminoActual.add(ady);
                    backtrack(ady, caminoActual, visitados, salida);
                    caminoActual.remove(caminoActual.size()-1);
                    visitados.remove(ady);
                }


            }

        }
    }
}
