import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int entrada = pedirEntrada();
        while (entrada!=0) {
            System.out.println("el numero es "+entrada);
            entrada = pedirEntrada();

            
        }
    }
    public static int pedirEntrada(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero=0;
        try {
            System.out.println("ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());

            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return numero;
    }
}
