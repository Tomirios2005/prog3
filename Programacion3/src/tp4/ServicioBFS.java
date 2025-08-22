package ProgramacionIII.tp4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ServicioBFS<T> {
    private Grafo<T> grafo;
    private Queue<Integer> fila;

    public ServicioBFS(Grafo<T> grafo) {
        this.grafo = grafo;
        fila = new LinkedList<>();
    }

    public void bfs() {
        fila.clear();
        Iterator<Integer> vertices = grafo.obtenerVertices();
        HashMap<Integer, Boolean> visitado = new HashMap<>();

        while (vertices.hasNext()) {
            visitado.put(vertices.next(), false);
        }

        for (Integer i : visitado.keySet()) {
            if (!visitado.get(i)) {
                bfs(i, visitado);
            }
        }
    }

    private void bfs(Integer i, HashMap<Integer, Boolean> visitado) {
        fila.add(i);
        visitado.put(i, true);

        while (!fila.isEmpty()) {
            Integer actual = fila.poll();
            System.out.println("Visitando: " + actual); // Para ver el recorrido

            Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
            while (adyacentes.hasNext()) {
                Integer ady = adyacentes.next();
                if (!visitado.get(ady)) {
                    visitado.put(ady, true);
                    fila.add(ady);
                }
            }
        }
    }
}
