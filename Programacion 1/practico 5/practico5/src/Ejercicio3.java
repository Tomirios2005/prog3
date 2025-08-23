public class Ejercicio3 {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        int max = 10;
        double promedio = calcularPromedio(arreglo,max);
        System.out.println("el promedio es: "+promedio);
        int mayoresPromedio=encimaDelPromedio(arreglo, promedio, max);
        System.out.println(mayoresPromedio+" numeros encima del promedio");

    }
    public static double calcularPromedio(int[]arreglo, int max){
        double suma = 0;
        for (int i = 0; i < max; i++) {
            suma+=arreglo[i];

            
        }
        return suma/max;

    }
    public static int encimaDelPromedio(int[] arreglo, double promedio, int max){
        int contador=0;
        for (int i = 0; i < max; i++) {
            if (arreglo[i]>promedio) {
                contador++;
                
            }
            
        }
        return contador;

    }
    
}
