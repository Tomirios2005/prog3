public class Ejerciciovalen {
    final static int max = 20;

    public static void main(String[] args) {
        int[] arreglo = { 0, 0, 0, 1, 2, 3, 0, 0, 2, 3, 45, 5, 6, 7, 0, 0, 1, 2, 4, 0 };
        int inicio = 0;
        int fin = -1;
        int cantidad = 0;
        int mayorCant = 0;
        int mayorIni = 0;
        int mayorFin = 0;
        // System.out.println(arreglo.length);
        while (inicio < max) {
            inicio = obtenerInicio(arreglo, fin + 1);
            // inicio = 3-1
            // inicio es menor a 20? si
            if (inicio < max) {
                // inicio = 3
                fin = obtenerFinal(arreglo, inicio);
                // desde 3 mientras haya un num diferente de 0 = fin++;
                // fin = 6-1;
                cantidad = obtenerCantidad(inicio, fin);
                if (cantidad > mayorCant) {
                    mayorCant = cantidad;
                    mayorIni = inicio;
                    mayorFin = fin;
                }
            }
        }
        System.out.println("la secuencia de mayor tamaño esta entre la pos: " + mayorIni + " y " + mayorFin
                + " con una longitud de " + mayorCant);
    }

    public static int obtenerInicio(int[] arreglo, int ini) {
        while (ini < max && arreglo[ini] == 0) {
            ini++;
            System.out.println("ob inicio");
        }
        return ini;
    }

    public static int obtenerFinal(int[] arreglo, int ini) {
        int fin = ini;
        while (fin < max && arreglo[ini] != 0) {
            fin++;
            System.out.println("ob final");
        }
        return fin - 1;
    }

    public static int obtenerCantidad(int ini, int fin) {
        int cantidad = 0;
        while (ini <= fin) {
            cantidad++;
            ini++;
            System.out.println("ob cantidad");
        }
        return cantidad;
    }

}
