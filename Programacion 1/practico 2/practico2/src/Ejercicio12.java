import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio12 {
    public static void main(String[] args) {
        char menorLetra='z', mayorLetra='a',letraingresada='a';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        while (letraingresada>='a'&&letraingresada<='z') {
            try {
                System.out.println("Ingrese una letra minuscula, para terminar presione 0");
                letraingresada=entrada.readLine().charAt(0);
                if (letraingresada<menorLetra&&letraingresada!='0') {
                    menorLetra=letraingresada;
                    
                }else if(letraingresada>mayorLetra&&letraingresada!='0'){
                    mayorLetra=letraingresada;
                }
                

            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
        System.out.println("la mayor letra es: "+ mayorLetra);
        System.out.println("la menor letra es "+menorLetra);
    }
    
}
