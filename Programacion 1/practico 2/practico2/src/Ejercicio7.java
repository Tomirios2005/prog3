import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio7 {
    public static void main(String[] args) {
        char caracter='a';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
       

        while (caracter!='*') {
            try {
                System.out.println("Ingrese un caracter distinto de *");
                caracter = entrada.readLine().charAt(0);

                if (caracter == 'a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u') {
                System.out.println("es una  vocal minuscula");
                    
                }else if(caracter!='*'){
                    System.out.println("es un digito");
                }

                
                
            } catch (Exception exc) {
                System.out.println(exc);
            }
            
        }
            
        
      
        
    }
    
}
