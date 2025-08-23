import java.io.BufferedReader;
import java.io.InputStreamReader;
public class App {
    final static int max =21;
    final static int separador = -1;
    public static void main(String[] args) throws Exception {
        int[]arrA={-1,12,22,44,-1,23,34,55,-1,23,34,55,-1,23,34,55,-1,23,34,57,-1};
        int[]arrB={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,23,34,55,-1,-1,-1,-1,-1,-1};
        int cantMaxPatron=obtenerCantidadPatron(), ini=0, fin=-1, cantPatron=0;
        int iniPatron = buscarInicio(arrB,0);
        int finPatron = buscarFin(arrB, iniPatron);
        while (ini<max) {
            ini=buscarInicio(arrA,fin+1);
            if (ini<max) {
                fin=buscarFin(arrA,ini);
                if (contienePatron(arrA, ini, fin, arrB, iniPatron, finPatron)){
                    cantPatron++;
                    System.out.println("cantidad de patrones: "+cantPatron);
                    if (cantPatron>cantMaxPatron) {
                        eliminarSecuencia(arrA, ini, fin);
                        fin=ini;
                        
                    }

                }
                
            }
            
        }
        for (int i = 0; i < arrB.length; i++) {
            System.out.println(arrA[i]);
            
        }

    }
    public static int obtenerCantidadPatron(){
        int numero =-1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (numero<0) {
            try {
                System.out.println("ingrese un numero mayor a 0");
                numero=Integer.valueOf(entrada.readLine());
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
        return numero;

    }
    public static int buscarInicio(int[]arreglo, int inicio){
        while (inicio<max&&arreglo[inicio]==separador) {
            inicio++;
            
        }
        return inicio;
    }
    public static int buscarFin(int[]arreglo, int fin){
        while (fin<max&&arreglo[fin]!=separador) {
            fin++;
            
        }
        return fin-1;
    }
    public static boolean contienePatron(int[]arrA, int ini, int fin, int[]arrB, int iniPatron, int finPatron){
        while (ini<=fin&&iniPatron<=finPatron&&arrA[ini]==arrB[iniPatron]) {
            ini++;
            iniPatron++;
            
        }
       if (ini>fin&&iniPatron>finPatron) {
        return true;
       }
        return false;
    }
    public static void eliminarSecuencia(int[]arreglo, int ini, int fin){
        for (int i = ini; i <=fin; i++) {
            corrimientoIzquierda(arreglo,ini);
            
        }

    }
    public static void corrimientoIzquierda(int[]arreglo, int ini){
        for (int i = ini; i < max-1; i++) {
            arreglo[i]=arreglo[i+1];
            
        }
    }
}
