import java.io.BufferedReader;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) throws Exception {
        final int claveOriginal=303;
        int hora, claveUsuario, nuevaClave;
        try {
            
         
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese una hora");
            hora = Integer.valueOf(entrada.readLine());
            if (18<=hora&&hora<=23) {
            System.out.println("Ingrese la contraseña");
            claveUsuario = Integer.valueOf(entrada.readLine());
                if (claveUsuario==claveOriginal) {
                System.out.println("ingrese una segunda clave numerica entre 100 y 999");
                nuevaClave = Integer.valueOf(entrada.readLine());
                    if((nuevaClave/100)%(claveOriginal/100)==0||(claveOriginal/100)%(nuevaClave/100)==0){ 
                    System.out.println("la clave es correcta");
                    }
                }
                
                
            }
        }
    


            
        catch (Exception e) {
            // TODO: handle exception
        }


    }
    
}

