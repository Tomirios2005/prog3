import java.io.BufferedReader;
import java.io.InputStreamReader;
public class NumerosInversos {

    public static void main(String[] args) {
        int primerNumero;
        int segundoNumero;
        int tercerNumero;
        int cuartoNumero;
        int quintoNumero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            primerNumero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro numero");
            segundoNumero = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese otro numero");
            tercerNumero = Integer.valueOf(entrada.readLine());
            System.out.println("ingrese otro numero");
            cuartoNumero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un ultimo numero");
            quintoNumero = Integer.valueOf(entrada.readLine());

            System.out.println("Los numeros ingresados en orden inverso son: " + quintoNumero+", " +cuartoNumero+", "+tercerNumero+", "+segundoNumero+", "+ primerNumero);

        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
}