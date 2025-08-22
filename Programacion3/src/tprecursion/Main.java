package ProgramacionIII.tprecursion;

public class Main {
    public static void main(String[] args) {
        int[]arreglo={10,4};
        System.out.println(estaOrdenado(arreglo, 0));

    }
    public static boolean estaOrdenado(int[]arr, int pos){
        if (pos == arr.length-1){
            return true; //llego al final
        }
        if (arr[pos]>arr[pos+1]){
            return false;
        }
        return estaOrdenado(arr, pos+1);
    }
}
