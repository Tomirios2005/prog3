import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio21 {
    public static void main(String[] args) {
        int numero;
        boolean esPrimo=true;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingresa un numero");
            numero = Integer.valueOf(entrada.readLine());
            for (int i = 2; i < numero; i++) {
                if (numero%i==0) {
                    esPrimo=false;
                    
                }else{
                    esPrimo=true;
                }
                 
            }
            System.out.println("es primo?" + esPrimo);

        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}
