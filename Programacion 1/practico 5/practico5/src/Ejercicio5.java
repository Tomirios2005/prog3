public class Ejercicio5 {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("el arreglo original es:"+ arreglo[i]);
        }
        int[] arregloInvertido = invertirArreglo(arreglo);
        for (int i = 0; i < arregloInvertido.length; i++) {
            System.out.println("el arreglo invertido es"+ arregloInvertido[i]);
            
        }
    }
    public static int[] invertirArreglo(int[] arreglo){
        int[] arregloInvertido = new int[10];
        int posArregloInvertido = 0;
        for (int i = 9; i >=0; i--) {
            arregloInvertido[posArregloInvertido] = arreglo[i];
            posArregloInvertido++;

            

            
        }
        return arregloInvertido;
        
    }

    
}