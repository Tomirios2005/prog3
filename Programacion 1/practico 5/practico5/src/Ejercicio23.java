public class Ejercicio23 {
//     final static int max =20;
//     public static void main(String[] args) {
//         int[] arreglo = {0,1,2,3,4,0,1,2,3,4,0,1,9,8,7,0,1,2,3,0};
//         int inicio = inicioSecuencia(arreglo);
//         int fin = finSecuencia(arreglo, inicio);
//         System.out.println("el fin de la secuencia es: "+fin+" y el inicio es: "+ inicio);
        
            
        
        
//     }
//     public static int inicioSecuencia(int[]arreglo){
//         int inicioSecuencia=0;
//         int pos=0;
//         while (pos<max&&pos==0) {
//             pos++;
//             inicioSecuencia=pos;
           
            
//         }
//         return inicioSecuencia;
//     }
//     public static int finSecuencia(int[]arreglo, int inicio){
//         int finSecuencia =-1;
//         for (int i = inicio ; i < arreglo.length; i++) {
//             if (arreglo[i]==0) {
//                 finSecuencia=i-1;

                
//             }
            
//         }
//         return finSecuencia;
//     }
// }



public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1;
public static final double probabilidad_numero = 0.4;
public static void main(String[] args) {
int[] arr = {0,1,2,3,4,0,1,2,3,4,0,1,9,8,7,0,1,2,3,0};
imprimir_suma_cada_secuencia(arr);
}
public static void imprimir_suma_cada_secuencia(int[] arr){
int inicio=0,fin=-1,suma=0;
while ((inicio < MAX)){
inicio = obtener_inicio_secuencia(arr,fin+1);
if (inicio < MAX){
fin = obtener_fin_secuencia(arr,inicio);
suma = obtener_suma_secuencia(arr,inicio,fin);
System.out.println("La suma de la secuencia de "+inicio+" a "+fin+" es "+suma);
}
}
}
public static int obtener_fin_secuencia(int[] arrEnteros, int ini) {
    while (ini<MAX && arrEnteros[ini]!=0)
    ini++;
    return ini-1;
    }
    public static int obtener_inicio_secuencia(int[] arrEnteros, int ini) {
    while (ini<MAX && arrEnteros[ini]==0)
    ini++;
    return ini;
    }
    public static int obtener_suma_secuencia(int[] arr, int inicio, int fin){
    int suma = 0;
    while (inicio <= fin){
    suma+=arr[inicio];
    inicio++;
    }
    return suma;
    }
    }