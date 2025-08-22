package ProgramacionIII.final2702025;

import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio4 {
    private ArrayList<Llave> llaves;
    private ArrayList<Cerradura> cerraduras;
    private HashSet<Cerradura> abiertas;

    public Ejercicio4(ArrayList<Llave> llaves, ArrayList<Cerradura> cerraduras) {
        this.llaves = llaves;
        this.cerraduras = cerraduras;
        this.abiertas = new HashSet<>();
    }

    public HashSet<Llave> encontrarMin() {
        HashSet<Llave> solucion = new HashSet<>();

        while (abiertas.size() < cerraduras.size()) {
            Llave mejorLlave = null;
            int maxPtas = 0;

            // Buscar llave que abre más cerraduras todavía cerradas
            for (Llave llave : llaves) {
                if (!solucion.contains(llave)) {
                    int cantPtas = 0;
                    for (Cerradura cerradura : cerraduras) {
                        if (!abiertas.contains(cerradura) && abre(llave, cerradura)) {
                            cantPtas++;
                        }
                    }
                    if (cantPtas > maxPtas) {
                        maxPtas = cantPtas;
                        mejorLlave = llave;
                    }
                }
            }

            // Si no encontramos llave que abra nuevas cerraduras, salimos
            if (mejorLlave == null) break;

            // Agregar mejor llave y marcar cerraduras abiertas
            solucion.add(mejorLlave);
            for (Cerradura cerradura : cerraduras) {
                if (abre(mejorLlave, cerradura)) {
                    abiertas.add(cerradura);
                }
            }
        }

        return solucion;
    }

    // Método que se supone está implementado en otro lado
    private boolean abre(Llave llave, Cerradura cerradura) {
        // Aquí iría la lógica real
        return llave.abre(cerradura);
    }
}
