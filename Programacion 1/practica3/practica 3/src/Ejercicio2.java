import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio2 {
    public static void main(String[] args) {
        char caracter = ingresarCaracter();
        while ((caracter>='a'&&caracter<='z'||(caracter>='0'&&caracter<='9'))) {
            System.out.println("se ingresó: "+caracter);
            if (caracter>='a'&&caracter<='z') {
                if (caracter =='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u') {
                    System.out.println("el caracter ingresado es una vocal");
                    
                }else{
                    System.out.println("es consonante");
                }
                
            }
            caracter=ingresarCaracter();
            
        }
    }
    public static char ingresarCaracter(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracter='a';
        try {
            System.out.println("ingrese un caracter numero o letra minuscula");
            caracter = entrada.readLine().charAt(0);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        
        return caracter;

    }
}
