//Hacer un programa que dado un número N ingresado por el
//usuario, elimine las secuencias de tamaño N de números distintos
//de cero.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio27 {
    final static int max=16;
    int[] arreglo = { 0, 1, 2, 3,0, 2, 3, 45, 5, 6, 7, 0,1, 2, 4, 0 };
                   
    public static void main(String[] args) {
        int[] arreglo = { 0, 0, 0, 1, 2, 3, 0, 0, 2, 3, 45, 5, 6, 7, 0, 0, 1, 2, 4, 0 };
        int inicio = 0, fin=-1, entradaUsuario=0;
        entradaUsuario=pedirEntrada();
        while (inicio<max) {
            inicio=buscarInicio(arreglo, fin+1);
            if (inicio<max) {
                fin=buscarFin(arreglo, inicio);
                if (entradaUsuario==fin-inicio+1) {
                    eliminarSecuencia(arreglo,inicio,fin);
                    fin=inicio;                    
                }
                
            }
            
        }
        for (int i = 0; i < max; i++) {
            System.out.println(arreglo[i]);
            
        }
        
    }
    public static int pedirEntrada(){
        int numero=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese un numero");
        numero = Integer.valueOf(entrada.readLine());
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        return numero;

    }
    public static int buscarInicio(int[]arreglo, int inicio){
        while (inicio<max&&arreglo[inicio]==0) {
            inicio++;
            
        }
        return inicio;
    }
    public static int buscarFin(int[]arreglo, int fin){
        while (fin<max&&arreglo[fin]!=0) {
            fin++;
            
        }
        return fin-1;
    }
    public static void eliminarSecuencia(int[]arreglo, int ini, int fin) {
        for (int i = ini; i <=fin; i++) {
            corrimientoIzquierda(arreglo, ini);
            
        }
        
    }
    public static void corrimientoIzquierda(int[]arreglo, int ini){
        for (int i = ini; i < max-1; i++) {
            arreglo[i]=arreglo[i+1];
            
        }
    }
    
}
