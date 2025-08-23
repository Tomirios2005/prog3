import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CargaUsuario {
    public static void main(String[] args) {
        char nombre;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingresa tu nombre");
            nombre = entrada.readLine().charAt(1);
            System.out.println("Hola " + nombre);
            
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}