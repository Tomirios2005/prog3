public class Ejercicio31 {
//Hacer un programa que invierta el orden de la última secuencia
//en un arreglo.
    final static int max=17;
    public static void main(String[] args) {
        int[] arreglo = { 0, 1, 2, 3,0, 2, 3, 45, 5, 6, 7, 0,1, 2, 4,5, 0 };
        int ini=0, fin=-1, iniUltima=0, finUltima=0;
        while (ini<max) {
           
            ini=buscarInicio(arreglo,fin+1);
            if (ini<max) {
                iniUltima=ini;
                fin=buscarFin(arreglo,ini);
                finUltima=fin;
                
            }
       
            
        }

        invertirUltimaSecuencia(arreglo,iniUltima,finUltima);
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
    public static void invertirUltimaSecuencia(int[]arreglo, int ini, int fin){
       while (ini<=fin) {
        int temp=arreglo[ini];
        arreglo[ini]=arreglo[fin];
        arreglo[fin]=temp;
        ini++;
        fin--;


        
       }
        for (int i = 0; i < max; i++) {
            System.out.print(arreglo[i]+"|");
            
        }

       
    }
    
}
