import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio12 {
    public static int pedirNumero() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero=1;
        try {
            System.out.println("ingrese un numero entre 1 y 6");
            numero = Integer.valueOf(entrada.readLine());   
 
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return numero;

    }
    public static int tirarDado(int numeroUsuario) {
        int tiradas=0;
        int numerodelDado=1;
        int contador = 0;
       while (tiradas<1000) {
        numerodelDado = (int)(6*Math.random()+1);
        System.out.println(numerodelDado);
        if (numerodelDado==numeroUsuario) {
            contador++;

            
        }
        tiradas++;
        
       }
       return contador;
        
    }

    public static void main(String[] args) {
        int numeroUsuario = pedirNumero();
        int cantdeVeces = tirarDado(numeroUsuario);
        System.out.println("el numero ha salido "+ cantdeVeces + " veces");

        
    }

    
} 