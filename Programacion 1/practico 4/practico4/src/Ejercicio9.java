public class Ejercicio9 {
   final static int max = 6;
    public static void main(String[] args) throws Exception {
        char[] arr = {'a', 'b', 'c', 'd', 'a', 'a'};
        boolean seRepite = verificarRep(arr);
        if (seRepite) {
            System.out.println("hay un caracter repetido");
            
        }
        arr = corrimientoDerecha(arr);
        System.out.println(arr);

    }
    public static boolean verificarRep(char[] arreglo){
        boolean seRepite = false;
        for (int i = 0; i < max; i++) {
            for (int j = i+1; j < max; j++) {
                if (arreglo[j]==arreglo[i]) {
                    seRepite = true;
                    
                }else{
                    seRepite = false;
                }
                
            }
         
            
        }
        return seRepite;

    }

    public static char[] corrimientoDerecha(char[] arreglo){
        int pos=0;
        while (pos<max-1) {
            arreglo[pos] = arreglo[pos+1];
            pos++;
            
        }
        return arreglo;

    }
}
