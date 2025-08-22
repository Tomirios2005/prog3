package ProgramacionIII.finalJulio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Patron2 {
    private Grafo<Integer>grafo;
    private final int inicio=5;
    private final int fin=2;
    private final int max=5;
    private int suma;
    private ArrayList<Integer>recorrido;
    public Patron2(Grafo<Integer>grafo){
        this.grafo=grafo;
        recorrido=new ArrayList<>();
        suma=0;
    }
    public boolean existePatron(){
        ArrayList<Integer>caminoActual=new ArrayList<>();

        if (backtracking(caminoActual, inicio)){
            System.out.print("recorrido"+recorrido);
            return true;
        }
        return false;

    }
    private boolean backtracking(ArrayList<Integer>caminoActual, int vertice){
        caminoActual.add(vertice);
        this.suma+=vertice;
        if (vertice==fin&&this.suma==25&& caminoActual.size()==this.max){
            this.recorrido.addAll(caminoActual);
            return true;
        }
        if (vertice!=fin&&this.suma<25&& caminoActual.size()<this.max){
            Iterator<Integer>adyacentes=grafo.obtenerAdyacentes(vertice);
            while (adyacentes.hasNext()){
                int ady= adyacentes.next();
                if (!caminoActual.contains(ady)&&backtracking(caminoActual,ady)){
                    return true;
                }
            }
        }
        caminoActual.removeLast();
        suma-=vertice;
        return false;
    }

}
