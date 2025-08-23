//Hacer un programa que devuelva la posición de inicio y de fin de la secuencia de mayor tamaño.

public class Ejercicio26 {
    final static int max = 20;

    public static void main(String[] args) {
        int[] arreglo = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 0, 1, 2, 0 };
        int inicio = 0;
        int fin = -1;
        int longitud = 0;
        int mayorLongitud = 0;
        int iniMax = 0;
        int finMax = 0;
        while (inicio < max) {
            inicio = buscarInicio(arreglo, fin + 1);
            if (inicio < max) {
                fin = buscarFin(arreglo, inicio);
                longitud = buscarMayorLongitud(arreglo, inicio, fin);
                if (longitud > mayorLongitud) {
                    mayorLongitud = longitud;
                    iniMax = inicio;
                    finMax = fin;

                }

            }

        }
        System.out.println("la mayor longitud es de: " + mayorLongitud + "y se encuentra entre las posiciones" + iniMax
                + "y" + finMax);
    }

    public static int buscarInicio(int[] arreglo, int ini) {
        while (ini < max && arreglo[ini] == 0) {
            ini++;

        }
        return ini;
    }

    public static int buscarFin(int[] arreglo, int ini) {
        while (ini < max && arreglo[ini] != 0) {
            ini++;

        }

        return ini - 1;
    }

    public static int buscarMayorLongitud(int[] arreglo, int inicio, int fin) {
        int longitudActual = 0;

        for (int i = inicio; i <= fin; i++) {
            longitudActual++;

        }
        return longitudActual;
    }
}
