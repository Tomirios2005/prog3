package ProgramacionIII.tp6.ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {
    int[] monedas;
    int cantidad;
    ArrayList<Integer> minMonedas;

    public Ejercicio1(int[] monedas, int cantidad) {
        this.monedas = monedas;
        this.cantidad = cantidad;
        this.minMonedas = new ArrayList<>();
    }

    public ArrayList<Integer> getCant() {
        ordenarMonedasDesc(); // método con tu lógica
        greedy();
        return minMonedas;
    }

    private void ordenarMonedasDesc() {
        for (int i = 0; i < monedas.length - 1; i++) {
            for (int j = i + 1; j < monedas.length; j++) {
                if (monedas[j] > monedas[i]) {
                    int tmp = monedas[i];
                    monedas[i] = monedas[j];
                    monedas[j] = tmp;
                }
            }
        }
    }

    public void greedy() {
        int resto = cantidad;
        for (int i = 0; i < monedas.length && resto > 0; i++) {
            while (monedas[i] <= resto) {
                minMonedas.add(monedas[i]);
                resto -= monedas[i];
            }
        }
    }
}
