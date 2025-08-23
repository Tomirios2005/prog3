import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int[] arreglo = new int[15];
        int max = 15;
        ingresarDatos(arreglo, max);
        for (int i = 0; i < max; i++) {
            System.out.println(arreglo[i]);
            
        }
        System.out.println("Hello, World!");
    }
    public static void ingresarDatos(int[] arreglo, int max){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        int pos = 0;
        while (pos<max) {
            try {
                System.out.println("ingrese un numero entre 1 y 12");
                numero = Integer.valueOf(entrada.readLine());
                arreglo[pos]=numero;
                pos++;
                if (numero<1||numero>12) {
                    System.out.println("ingresaste un numero fuera del rango");
                    pos--;

                    
                }
                
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }

    }
}
