import java.io.BufferedReader; //biblioteca que contiene operaciones de E/S
import java.io.InputStreamReader; //biblioteca que contiene operaciones de E/S
public class practica {

    public static void main(String[] args) {
        float altura;
        float base;
        float area;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la base del rectangulo: ");
            base= Float.valueOf(entrada.readLine());
            System.out.println("ingrese la altura:");
            altura= Float.valueOf(entrada.readLine());
            area=base*altura;
            System.out.println("el area del rectangulo es: "+ area+"cm");
            
        } catch (Exception exc) {
            System.out.println("error");
        }


        
    }
}