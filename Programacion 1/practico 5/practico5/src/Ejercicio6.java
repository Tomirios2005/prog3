public class Ejercicio6 {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        int numerosPrimos = verificarPrimos(arreglo);
        System.out.println(numerosPrimos);
    }
    public static int verificarPrimos(int[] arreglo){
        int numerosPrimos=0;
        boolean esPrimo = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 2; j < i; j++) {
                if (arreglo[i]%j==0) {
                    esPrimo=false;
                    
                }

            }
            if (arreglo[i]==1) {
                esPrimo=false;
                System.out.println(arreglo[i]+"no es primo");
                
            }
            else if (esPrimo) {
                System.out.println(arreglo[i]+"es primo");
                numerosPrimos++;
                
            }else{
                System.out.println(arreglo[i]+"no es primo");
            }
            esPrimo=true;
            
        }
        return numerosPrimos;
    }
}
