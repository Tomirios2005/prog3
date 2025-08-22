package ProgramacionIII.parcial;

import ProgramacionIII.tp4.Arco;
import ProgramacionIII.tp4.Grafo;

import java.util.*;

public class Ejercicio1<T> {
    private Grafo<T> grafo;
    private ArrayList<Integer> mejorCiclo;
    private int mejorPeso;

    public Ejercicio1(Grafo<T> grafo) {
        this.grafo = grafo;
        this.mejorCiclo = new ArrayList<>();
        this.mejorPeso = -1;
    }

    public ArrayList<Integer> getCicloHamiltonianoDeMayorPeso() {
        Iterator<Integer> it = grafo.obtenerVertices();
        while (it.hasNext()) {
            Integer inicio = it.next();
            Set<Integer> visitados = new HashSet<>();
            List<Integer> caminoActual = new ArrayList<>();
            visitados.add(inicio);
            caminoActual.add(inicio);
            backtrack(inicio, inicio, visitados, caminoActual, 0);
        }
        return mejorCiclo;
    }

    private void backtrack(Integer actual, Integer inicio, Set<Integer> visitados, List<Integer> caminoActual, int pesoActual) {
        if (visitados.size() == grafo.cantidadVertices()) {
            // Verificamos si hay arco de regreso al inicio
            if (grafo.existeArco(actual, inicio)) {
                Arco<T> arco = grafo.obtenerArco(actual, inicio);
                int pesoFinal = pesoActual + (int) arco.getEtiqueta();
                if (pesoFinal > mejorPeso) {
                    mejorPeso = pesoFinal;
                    mejorCiclo = new ArrayList<>(caminoActual);
                    mejorCiclo.add(inicio); // cerrar ciclo
                }
            }
        }else{
            Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(actual);
            while (adyacentes != null && adyacentes.hasNext()) {
                Integer sig = adyacentes.next();
                if (!visitados.contains(sig)) {
                    visitados.add(sig);
                    caminoActual.add(sig);
                    int pesoArco = (int) grafo.obtenerArco(actual, sig).getEtiqueta();
                    backtrack(sig, inicio, visitados, caminoActual, pesoActual + pesoArco);
                    visitados.remove(sig);
                    caminoActual.remove(caminoActual.size() - 1);
                }
            }

        }


    }
}
