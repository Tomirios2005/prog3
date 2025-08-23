import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio20 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero = 1;
        char caracterIngresado;
        while (numero!=0&&numero>=1) {
            try {
                System.out.println("Ingresá un numero (pulse 0 para salir)");
                numero = Integer.valueOf(entrada.readLine());
                if (numero!=0) {
                    System.out.println("Ingrese un caracter");
                    caracterIngresado = entrada.readLine().charAt(0);
                    switch (caracterIngresado) {
                        case 'a': 
                            System.out.println("ingrese un texto");
                            String textoLibre = entrada.readLine();
                            System.out.println(textoLibre);                
                            break;
                        case 'b':
                            boolean ascendente=true;
                            int numeroAnterior=0;
                            for (int i = 1; i <=5; i++) {
                                System.out.println("Ingresá 5 numeros positivos");
                                numero = Integer.valueOf(entrada.readLine());
                                if (numero<numeroAnterior) {
                                    ascendente = false;
                                }
                                numeroAnterior = numero;
                            }
                            if (ascendente==false) {
                                System.out.println("no es ascendente");
                                
                            }else {
                                System.out.println("es ascendente");
                            }
                        case 'c':
                           System.out.println("ingresa un numero");
                           int numero1 = Integer.valueOf(entrada.readLine());
                           System.out.println("ingresa un numero");
                           int numero2 = Integer.valueOf(entrada.readLine());
                           int multiplicados = numero1*numero2;
                           System.out.println("la raiz cuadrada es"+Math.sqrt(multiplicados)); 
                           
                    
                        default:
                            break;
                    }
                    
                }

      
            } catch (Exception e) {
                System.out.println("lee bien puto");
            }
            
        }
    }
    
}
