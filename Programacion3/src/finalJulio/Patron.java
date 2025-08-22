package ProgramacionIII.finalJulio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Patron {
    private final ArrayList<Integer> patron = new ArrayList<>();
    private Grafo<Integer> grafo;

    public Patron(Grafo<Integer> grafo) {
        // Patrón buscado
        this.patron.add(5);
        this.patron.add(7);
        this.patron.add(4);
        this.patron.add(1);
        this.grafo = grafo;
    }

    // Valida si la solución parcial coincide con el patrón hasta ese punto
    public boolean validarParcial(ArrayList<Integer> intento) {
        for (int i = 0; i < intento.size(); i++) {
            if (!patron.get(i).equals(intento.get(i))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> devolverPatron() {
        ArrayList<Integer> solucion = new ArrayList<>();
        Iterator<Integer> vertices = grafo.obtenerVertices();

        while (vertices.hasNext()) {
            Integer vertice = vertices.next();
            if (backtracking(vertice, solucion, new HashSet<>())) {
                return solucion;
            }
        }
        return null; // No encontrado
    }

    private boolean backtracking(Integer vertice, ArrayList<Integer> solucion, HashSet<Integer> visitados) {
        solucion.add(vertice);
        visitados.add(vertice);

        if (!validarParcial(solucion)) {
            solucion.remove(solucion.size() - 1);
            visitados.remove(vertice);
            return false;
        }

        if (solucion.size() == patron.size()) {
            return true; // patrón completo
        }

        Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(vertice);
        while (adyacentes.hasNext()) {
            Integer ady = adyacentes.next();
            if (!visitados.contains(ady)) {
                if (backtracking(ady, solucion, visitados)) {
                    return true;
                }
            }
        }

        solucion.remove(solucion.size() - 1);
        visitados.remove(vertice);
        return false;
    }

    public static void main(String[] args) {
        Grafo<Integer> g = new GrafoDirigido<>();

        // Grafo que sí contiene el patrón 5 -> 7 -> 4 -> 1
        g.agregarVertice(7);
        g.agregarVertice(4);
        g.agregarVertice(1);
        g.agregarVertice(9);
        g.agregarVertice(5);


        g.agregarArco(7, 4, 0);
        g.agregarArco(4, 1, 0);
        g.agregarArco(1, 9, 0);
        g.agregarArco(5, 7, 0);


        Patron p = new Patron(g);
        ArrayList<Integer> resultado = p.devolverPatron();

        if (resultado != null) {
            System.out.println("Patrón encontrado: " + resultado);
        } else {
            System.out.println("No se encontró el patrón.");
        }
    }
}
