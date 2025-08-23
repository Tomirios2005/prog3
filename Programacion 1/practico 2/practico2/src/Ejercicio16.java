import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio16 {
    public static void main(String[] args) {
        char caracter;
        int aSeguidas=0;
        int contadorMasA=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <=15; i++) {
            try {
                System.out.println("ingresa el caracter numero "+i);
                caracter = entrada.readLine().charAt(0);
                if (caracter=='a') {
                    aSeguidas++;

                    
                }else{
                    aSeguidas=0;

                }
                if(aSeguidas>contadorMasA){
                    contadorMasA=aSeguidas;
                    
                }
                




            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
        System.out.println("se han ingresado "+contadorMasA+" 'a' seguidas ");
    }
    
}
