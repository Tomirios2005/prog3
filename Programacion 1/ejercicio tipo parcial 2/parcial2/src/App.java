public class App {
    final static int max_a = 26;
    final static int max_s = 6;

    public static void main(String[] args) throws Exception {
        char[] arrPalabras = { ',', 'h', 'o', 'l', 'a', ',', 'l', 'a', ',', 'v', 'a', 'c', 'a', ',', 'l', 'o', 'l', 'a',
                ',', 'e', 'l', ',', 'p', 'u', 't', 'o' };
        char[] arrStop = { ',', 'l', 'a', ',', 'e', 'l' };
        int inicio = 0;
        int fin = -1;
        while (inicio < max_a) {
            inicio = encontrarInicio(arrPalabras, fin + 1, max_a);
            if (inicio < max_a) {
                fin = encontrarFin(arrPalabras, inicio, max_a);
                if (esStop(arrPalabras, arrStop, inicio, fin)) {
                    eliminarStops(arrPalabras, inicio, fin);

                }

            }

        }
        for (int i = 0; i < max_a; i++) {
            System.out.println(arrPalabras[i]);
        }
    }
    public static int encontrarInicio (char[]arreglo, int inicio, int max){
        while (inicio<max&&arreglo[inicio]==',') {
            inicio++;
            
        }


        return inicio;
    }
    public static int encontrarFin(char[]arreglo, int fin, int max){
        while (fin<max&&arreglo[fin]!=',') {
            fin++;
            
        }
        return fin-1;

    }
    public static boolean esStop(char[]arrPalabras, char[]arrStop, int iniPalabras, int finPalabras){
        int iniStop=0;
        int finStop=-1;
        boolean esStop=false;
       
        while (iniStop<max_s&&!esStop) {
            iniStop=encontrarInicio(arrStop, finStop+1, max_s);
            if (iniStop<max_s) {
                finStop=encontrarFin(arrStop, iniStop, max_s);
                if (finStop-iniStop+1==finPalabras-iniPalabras+1&&sonIguales(arrPalabras,iniPalabras,finPalabras,arrStop,iniStop)) {
                    esStop=true;
                   
    
    
                }
                
            }
          

        }
      


        return esStop;
    }
    public static boolean sonIguales(char[]arrPalabras, int iniPalabras,int finPalabras, char[]arrStop, int inistop){
        while (iniPalabras<=finPalabras&&arrPalabras[iniPalabras]==arrStop[inistop]) {
            iniPalabras++;
            inistop++;
            
        }
        return iniPalabras>finPalabras;
    }
    public static void eliminarStops(char[]arrPalabras, int inicio, int fin){
        for (int i = inicio; i <=fin; i++) {
            for (int j = inicio; j < max_a-1; j++) {
                
                    arrPalabras[j]=arrPalabras[j+1];
                
            }
            
        }
        

    }
}
