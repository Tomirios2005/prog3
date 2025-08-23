import java.io.BufferedReader;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) throws Exception {
        //ejercicio 1
        int numero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero entero");
            numero = Integer.valueOf(entrada.readLine());
            //a
            if (numero>0) {
                System.out.println("el numero es positivo");    
                
            }else{
                System.out.println("El numero es negativo");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        //1b
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero entero del 1 al 7");
            numero = Integer.valueOf(entrada.readLine());
            switch (numero) {
                case 1:
                    System.out.println("Hoy es lunes"); 
                    break;
                case 2: 
                    System.out.println("hoy es martes");
                    break;
                case 3: 
                    System.out.println("hoy es miercoles");
                    break;
                case 4: 
                    System.out.println("hoy es jueves");
                    break;
                case 5: 
                    System.out.println("hoy es viernes");
                    break;
                case 6: 
                    System.out.println("hoy es sabado");
                    break;
                case 7: 
                    System.out.println("hoy es domingo");
                    break;
            
                default:
                    break;
            }
            
            
        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}
