/*package ProgramacionIII.finalJulio;

import ProgramacionIII.tp2.Tree;
import ProgramacionIII.tp2.TreeNode;

import java.util.*;

public class Main {
    Grafo<Integer>grafo=new GrafoNoDirigido<>();
    public static void main(String[] args) {
        List<Prenda> prendas = Arrays.asList(
                new Prenda("negra", 500),
                new Prenda("blanca", 200),
                new Prenda("color", 800),
                new Prenda("blanca", 1000),
                new Prenda("negra", 300),
                new Prenda("color", 400)
        );

        int capacidadMax = 6000; // 6 kg
        int totalLavados = calcularLavados(prendas, capacidadMax);

        System.out.println("Lavados necesarios: " + totalLavados);




    }
    Iterator<Integer> vertices=grafo.obtenerVertices();
    public int[] dijkstra(Grafo<Integer> grafo, int origen) {
        int n = grafo.cantidadVertices();
        int[] distancias = new int[n];
        boolean[] visitado = new boolean[n];

        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[origen] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, origen});

        while (!pq.isEmpty()) {
            int[] actual = pq.poll();
            int distanciaActual = actual[0];
            int verticeActual = actual[1];

            if (visitado[verticeActual]) continue;
            visitado[verticeActual] = true;

            Iterator<Integer> vecinos = grafo.obtenerAdyacentes(verticeActual);
            while (vecinos.hasNext()) {
                int vecino = vecinos.next();
                int peso = grafo.obtenerArco(verticeActual, vecino).getEtiqueta();

                if (distancias[verticeActual] + peso < distancias[vecino]) {
                    distancias[vecino] = distancias[verticeActual] + peso;
                    pq.add(new int[]{distancias[vecino], vecino});
                }
            }
        }

        return distancias;
    }

    public int obtenerCiudad(){
        int mejorCiudad=-1;
        int mejorPeso= Integer.MAX_VALUE;
        Iterator<Integer>ciudades = grafo.obtenerVertices();
        while (ciudades.hasNext()){
            int pesoActual=0;
            int actual=ciudades.next();
            int[]distancias=dijkstra(grafo, actual);
            for (int distancia : distancias) {
                pesoActual += distancia;

            }
            if (pesoActual<mejorPeso){
                mejorPeso=pesoActual;
                mejorCiudad=actual;
            }

        }
        return mejorCiudad;
    }

    public boolean mismaEstructura(Tree a, Tree b){
        return mismaEstructura(a.getRoot(),b.getRoot());
    }
    private boolean mismaEstructura(TreeNode a, TreeNode b){
        if (a.getValue()==null&&b.getValue()==null){
            return true;
        }
        if (a.getValue()==null||b.getValue()==null){
            return false;
        }
         return mismaEstructura(a.getLeft(), b.getLeft()) && mismaEstructura(a.getRight(), b.getRight());

    }
    import java.util.*;

    class Prenda {
        String color; // "blanca", "negra" o "color"
        int peso; // en gramos

        public Prenda(String color, int peso) {
            this.color = color;
            this.peso = peso;
        }
    }

    public class LavanderiaGreedy {

        public static int calcularLavados(List<Prenda> prendas, int capacidadMax) {
            // Separar en listas
            List<Prenda> blancas = new ArrayList<>();
            List<Prenda> negras = new ArrayList<>();
            List<Prenda> colores = new ArrayList<>();
            HashSet<Prenda>prendasLavadas=new HashSet<>();

            for (Prenda p : prendas) {
                switch (p.color) {
                    case "blanca": blancas.add(p); break;
                    case "negra": negras.add(p); break;
                    default: colores.add(p); break;
                }
            }

            // Ordenar cada lista de mayor a menor peso
            Comparator<Prenda> cmp = (a, b) -> b.peso - a.peso;
            blancas.sort(cmp);
            negras.sort(cmp);
            colores.sort(cmp);

            // Asignar colores donde mejor encajen
            int lavadosBlancas = empaquetar(blancas, colores, capacidadMax, prendasLavadas);
            int lavadosNegras  = empaquetar(negras, colores, capacidadMax, prendasLavadas);

            return lavadosBlancas + lavadosNegras;
        }

        // Método para empaquetar usando Greedy First Fit
        private static int empaquetar(List<Prenda> base, List<Prenda> colores, int capacidadMax, HashSet<Prenda>prendasLavadas) {
            int lavados = 0;
            List<Prenda> todas = new ArrayList<>(base);

            // Agregar colores para este grupo
            todas.addAll(colores);

            // Ordenar de mayor a menor
            todas.sort((a, b) -> b.peso - a.peso);

            while (!todas.isEmpty()) {
                int carga = 0;
                Iterator<Prenda> it = todas.iterator(); //para despues borrar con it.remove, si usas for te tira error
                while (it.hasNext()) {
                    Prenda p = it.next();
                    if (carga + p.peso <= capacidadMax&&!prendasLavadas.contains(p)) {
                        carga += p.peso;
                        prendasLavadas.add(p);
                        it.remove(); //borra la referencia

                    }
                }
                lavados++;
            }
            return lavados;
        }


    }



}








}
*/
package ProgramacionIII.finalJulio;

public class Main {
    public static void main(String[] args) {
        // Crear el grafo
        GrafoDirigido<Integer> grafo = new GrafoDirigido<>();

        // Agregar vértices
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);

        // Agregar aristas (simulando grafo NO dirigido)
        grafo.agregarArco(1, 2, null);
        grafo.agregarArco(2, 1, null);
        grafo.agregarArco(1, 3, null);
        grafo.agregarArco(3, 1, null);
        grafo.agregarArco(3, 4, null);
        grafo.agregarArco(4, 3, null);
        grafo.agregarArco(3, 5, null);
        grafo.agregarArco(5, 3, null);

        // Crear objeto Articulacion y ejecutar
        Articulacion articulacion = new Articulacion(grafo);
        articulacion.dfs();

        // Mostrar resultados
        System.out.println("Vértices de articulación detectados: " + articulacion.getVerticesArticulados());
    }
}
