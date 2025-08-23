public class Parcial2023 {
    final static int max=20, separador=0,x=3;
    public static void main(String[] args) {
        int inicio=0, fin=-1, rep=0;
        int[]arr={0,67,67,67,67,67,67,67,67,0,14,0,33,33,33,33,0,5,98,0};
        while (inicio<max) {
            inicio=buscarInicio(arr,fin+1);
            if (inicio<max) {
                fin=buscarFin(arr,inicio);
                rep=contarReps(arr,inicio,fin);
                if (rep>x) {
                    borrarSecuencia(arr,inicio,fin,rep);
                    fin=inicio;
                    
                }
                
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"|");
        }
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
    public static int contarReps(int[]arreglo, int inicio, int fin){
        int pos=inicio, contador=0;
        while (pos<=fin&&arreglo[pos]==arreglo[inicio]) {
            pos++;
            contador++;
            
        }
        return contador;
    }
    public static void borrarSecuencia(int[]arreglo, int inicio, int fin, int rep){
        for (int i = inicio+2; i <=fin; i++) {
            correrIzquierda(arreglo,inicio);

            
        }
        arreglo[inicio]=-rep;
    }
    public static void correrIzquierda(int[]arreglo, int ini){
        for (int i = ini; i < max-1; i++) {
            arreglo[i]=arreglo[i+1];
            
        }
      
    }
    
}
