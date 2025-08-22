package ProgramacionIII.tp5.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio2 {
    private Casillero[][] laberinto;
    private ArrayList<Integer> camino;
    private int inicio, fin;
    private HashMap<Integer, String> colores = new HashMap<>();

    public Ejercicio2(Casillero[][] laberinto, int inicio, int fin) {
        this.laberinto = laberinto;
        this.inicio = inicio;
        this.fin = fin;
        camino = new ArrayList<>();
    }

    public ArrayList<Integer> getCamino() {
        int iinicio = 0;
        int jinicio = 0;
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                colores.put(laberinto[i][j].getValor(), "blanco");
                if (laberinto[i][j].getValor() == inicio) {
                    jinicio = j;
                    iinicio = i;
                }
            }
        }
        ArrayList<Integer> solucionActual = new ArrayList<>();
        getCaminoRec(iinicio, jinicio, solucionActual);
        return camino;
    }

    public void getCaminoRec(int posi, int posj, ArrayList<Integer> solucionActual) {
        int valor = laberinto[posi][posj].getValor();
        if (!colores.get(valor).equals("blanco")) {
            return;
        }

        colores.put(valor, "amarillo");
        solucionActual.add(valor);

        if (valor == fin) {
            int largoActual = solucionActual.stream().mapToInt(Integer::intValue).sum();
            int largoCamino = camino.stream().mapToInt(Integer::intValue).sum();

            if (camino.isEmpty() || largoActual < largoCamino) {
                camino = new ArrayList<>(solucionActual);
            }
        } else {

            if (laberinto[posi][posj].isNorte() && posi - 1 >= 0) {
                getCaminoRec(posi - 1, posj, solucionActual);
            }
            if (laberinto[posi][posj].isSur() && posi + 1 < laberinto.length) {
                getCaminoRec(posi + 1, posj, solucionActual);
            }
            if (laberinto[posi][posj].isEste() && posj + 1 < laberinto[0].length) {
                getCaminoRec(posi, posj + 1, solucionActual);
            }
            if (laberinto[posi][posj].isOeste() && posj - 1 >= 0) {
                getCaminoRec(posi, posj - 1, solucionActual);
            }
        }

        solucionActual.removeLast();
        colores.put(valor, "blanco");
    }
}
