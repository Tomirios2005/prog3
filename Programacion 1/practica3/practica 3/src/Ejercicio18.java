public class Ejercicio18 {
    public static void main(String[] args) {
        numerosPerfectos();
    }
    public static void numerosPerfectos(){
        int contadorDivisor = 0;
        int numeroActual = 2;
        int numerosPerfectos = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 1; j < numeroActual; j++) {
                if (numeroActual%j==0) {
                    contadorDivisor+=j;

                    
                }
              


                
            }
            if(contadorDivisor==numeroActual){
                numerosPerfectos++;
            }
            contadorDivisor=0;
            numeroActual++;

            
        }
        System.out.println("hay: "+numerosPerfectos);

    }
    
}