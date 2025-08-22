package ProgramacionIII.tp4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ServicioDFS<T> {
    private int tiempo;
    private Grafo<T>grafo;
    private HashMap<Integer, Integer>distancias;
    private ArrayList<Integer>visitados;
    public ServicioDFS(Grafo<T> grafo) {
        this.grafo = grafo;
        distancias = new HashMap<>();
        visitados=new ArrayList<>();
    }
    public void dfs(){
        HashMap<Integer, String>color=new HashMap<>();
        Iterator<Integer> iter = grafo.obtenerVertices();
        while (iter.hasNext()) {
            int vertice = iter.next();
            color.put(vertice, "blanco");
        }

        tiempo=0;
        for (Integer key : color.keySet()){
            if (color.get(key).equals("blanco")){
                dfs_visit(key, color);

            }
        }

    }
    public void dfs_visit(int verticeId, HashMap<Integer, String> color) {
        color.put(verticeId, "amarillo");
        tiempo++;
        visitados.add(verticeId);

        Iterator<Integer> it = grafo.obtenerAdyacentes(verticeId);
        while (it.hasNext()) {
            int adyacente = it.next();  // Store the adjacent vertex
            if (color.get(adyacente).equals("blanco")) {
                dfs_visit(adyacente, color);
            }else{
                if (color.get(adyacente).equals("amarillo")) {
                    System.out.println("hay un ciclo");
                }
            }
        }

        color.put(verticeId, "negro");
        tiempo++;
        distancias.put(verticeId, tiempo);
    }

    public ArrayList<Integer> getVisitados() {
        return visitados;
    }
}
