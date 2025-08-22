package ProgramacionIII.finalJulio;

import java.util.ArrayList;

public class Greedy {
    private ArrayList<Caja> cajas;

    public Greedy(ArrayList<Caja> cajas) {
        this.cajas = new ArrayList<>(cajas);
    }

    public int apilar() {
        ArrayList<ArrayList<Caja>> columnas = new ArrayList<>();

        for (Caja caja : cajas) {
            boolean colocada = false;

            // Intentar colocar la caja en una columna existente
            for (ArrayList<Caja> pila : columnas) {
                int pesoPila = 0;
                for (Caja c : pila) {
                    pesoPila += c.peso;
                }
                if (pesoPila + caja.peso <= caja.resistencia) {
                    pila.add(caja);
                    colocada = true;
                    break;
                }
            }

            // Si no se pudo colocar, crear nueva columna
            if (!colocada) {
                ArrayList<Caja> columna = new ArrayList<>();
                columna.add(caja);
                columnas.add(columna);
            }
        }

        return columnas.size();
    }

    // Clase auxiliar Caja
    public static class Caja {
        int peso;
        int resistencia;

        public Caja(int peso, int resistencia) {
            this.peso = peso;
            this.resistencia = resistencia;
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        ArrayList<Caja> lista = new ArrayList<>();
        lista.add(new Caja(10, 50));
        lista.add(new Caja(20, 60));
        lista.add(new Caja(30, 100));
        lista.add(new Caja(15, 40));
        lista.add(new Caja(25, 80));

        Greedy g = new Greedy(lista);
        System.out.println("Cantidad mínima de columnas: " + g.apilar());
    }
}
