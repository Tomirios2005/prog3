package ProgramacionIII.finalJulio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Articulacion  {
    private Grafo<Integer>grafo;
    private HashSet<Integer>verticesArticulados;
    private HashSet<Integer>visitados;
    private ArrayList<Integer>vertices;


    public Articulacion(Grafo<Integer> grafo) {
        this.grafo = grafo;
        verticesArticulados=new HashSet<>();
        visitados=new HashSet<>();
        vertices=new ArrayList<>();
    }
    public void dfs(){
        Iterator<Integer>verticesIt=grafo.obtenerVertices();
        while (verticesIt.hasNext()){
            vertices.add(verticesIt.next());


        }
        for(Integer verticeExc:vertices){
            visitados.clear();
            Integer inicio=null;


            for (Integer vertice:vertices) {
                if (!vertice.equals(verticeExc)) {
                    inicio=vertice;
                    break;

                }
            }
            dfs_visit(inicio,verticeExc);

            if (visitados.size()<vertices.size()-1) {
                verticesArticulados.add(verticeExc);
            }

        }
    }
    public void dfs_visit(Integer inicio, Integer exc){
        visitados.add(inicio);
        Iterator<Integer>adyacentes= grafo.obtenerAdyacentes(inicio);
        while (adyacentes.hasNext()){
            Integer ady=adyacentes.next();
            if (ady.equals(exc)){
                continue;
            }
            if (!visitados.contains(ady)){
                dfs_visit(ady, exc);
            }



        }

    }

    public HashSet<Integer> getVerticesArticulados() {
        return verticesArticulados;
    }
}
