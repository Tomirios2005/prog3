import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,3,9,10};
        buscarPosiciones(arreglo);
    }
    public static void buscarPosiciones(int[] arreglo){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numeroIngresado;
        try {
            System.out.println("ingrese el numero que quiere buscar en el arreglo");
            numeroIngresado = Integer.valueOf(entrada.readLine());
            boolean seEncuentra=false;
            for (int i = 0; i < 10; i++) {
                if (arreglo[i]==numeroIngresado) {
                    System.out.println("el numero "+numeroIngresado+"se encuentra en la posición "+i+" del arreglo");
                    seEncuentra=true;
                }
                
            }
            if (!seEncuentra) {
                System.out.println("el numero: "+numeroIngresado+" no se encuentra en el arreglo");
                
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
