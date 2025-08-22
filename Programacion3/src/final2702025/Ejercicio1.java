package ProgramacionIII.final2702025;

import ProgramacionIII.tp4.Grafo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio1 {
    private Grafo<Integer> grafo;
    private HashSet<Integer>visitados;
    private ArrayList<Integer>solucion;
    private int mayorPeso;
    Integer i,j;

    public Ejercicio1(Grafo<Integer> grafo, Integer i, Integer j) {
        this.grafo = grafo;
        this.i = i;
        this.j = j;
        visitados=new HashSet<>();
        solucion=new ArrayList<>();
        mayorPeso=0;
    }
    public ArrayList<Integer> encontrarCamino(){
        ArrayList<Integer>camino=new ArrayList<>();
        backtracking(camino, this.i,0);
        return solucion;

    }
    private void backtracking(ArrayList<Integer>caminoActual, Integer vertice, int pesoActual){
        caminoActual.add(vertice);
        visitados.add(vertice);
        if (pesoActual>mayorPeso&&vertice.equals(this.j)){
            this.mayorPeso=pesoActual;
            solucion=new ArrayList<>(caminoActual);
        }
        Iterator<Integer>adyacentes= grafo.obtenerAdyacentes(vertice);
        while (adyacentes.hasNext()){
            Integer ady=adyacentes.next();
            int pesoArco = grafo.obtenerArco(vertice, ady).getEtiqueta();
            if (!visitados.contains(ady)) {
                backtracking(caminoActual, ady, pesoActual+pesoArco);
            }
        }
        caminoActual.removeLast();
        visitados.remove(vertice);

    }
}
