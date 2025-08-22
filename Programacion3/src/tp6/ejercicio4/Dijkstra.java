package ProgramacionIII.tp4;

import java.util.*;

public class Dijkstra<T> {
    private Grafo<T> grafo;
    private Map<Integer, Integer> distancias;
    private Map<Integer, Integer> predecesores;

    public Dijkstra(Grafo<T> grafo) {
        this.grafo = grafo;
        this.distancias = new HashMap<>();
        this.predecesores = new HashMap<>();
    }

    public void ejecutarDijkstra(int origen) {
        PriorityQueue<Nodo> cola = new PriorityQueue<>(); //se ordena de menor a mayor
        Set<Integer> visitados = new HashSet<>();

        // Inicializar
        Iterator<Integer> vertices = grafo.obtenerVertices();
        while (vertices.hasNext()) {
            int v = vertices.next();
            distancias.put(v, Integer.MAX_VALUE); //distancia desde origen a v es infinita
            predecesores.put(v, null); //padre de v es null
        }

        distancias.put(origen, 0); //distancia al origen desde el mismo es 0
        cola.add(new Nodo(origen, 0)); //agrega a la cola

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            int u = actual.id;

            if (visitados.contains(u)) continue;
            visitados.add(u);

            Iterator<Arco<T>> arcos = grafo.obtenerArcos(u);
            while (arcos.hasNext()) {
                Arco<T> arco = arcos.next();
                int v = arco.getVerticeDestino();
                int peso = (Integer) arco.getEtiqueta();

                int nuevaDistancia = distancias.get(u) + peso;
                if (nuevaDistancia < distancias.get(v)) {
                    distancias.put(v, nuevaDistancia);
                    predecesores.put(v, u);
                    cola.add(new Nodo(v, nuevaDistancia));
                }
            }
        }
    }

    public void imprimirResultados(int origen) {
        System.out.println("Distancias mínimas desde " + origen + ":");
        for (Map.Entry<Integer, Integer> entry : distancias.entrySet()) {
            System.out.println("A " + entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\nCaminos más cortos:");
        for (Integer destino : distancias.keySet()) {
            if (!destino.equals(origen)) {
                System.out.print("Camino a " + destino + ": ");
                imprimirCamino(destino);
                System.out.println();
            }
        }
    }

    private void imprimirCamino(Integer destino) {
        if (predecesores.get(destino) == null) {
            System.out.print(destino);
            return;
        }
        imprimirCamino(predecesores.get(destino));
        System.out.print(" -> " + destino);
    }

    // Clase auxiliar para la PriorityQueue
    private class Nodo implements Comparable<Nodo> {
        int id;
        int distancia;

        Nodo(int id, int distancia) {
            this.id = id;
            this.distancia = distancia;
        }

        @Override
        public int compareTo(Nodo otro) {
            return Integer.compare(this.distancia, otro.distancia);
        }
    }
}
