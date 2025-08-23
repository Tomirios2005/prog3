import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio8 {
    public static void main(String[] args) {
        char[] arregloVocales = new char[5];
        char[] arregloConsonantes = new char[5];
        pedirEntrada(arregloVocales, arregloConsonantes);
    }
    public static void pedirEntrada(char[]vocales, char[] consonantes){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char caracterIngresado = 'a';
        int posVocal=0;
        int posConsonante=0;

        while (caracterIngresado>='a'&&caracterIngresado<='z') {
            try {
                System.out.println("ingresa un caracter vocal o consonante");
                caracterIngresado = entrada.readLine().charAt(0);
                if (caracterIngresado == 'a'||caracterIngresado=='e'||caracterIngresado=='i'||caracterIngresado=='o'||caracterIngresado=='u') {
                    vocales[posVocal]=caracterIngresado;
                    posVocal++;
                   

                    
                }else{
                    
                    consonantes[posConsonante] = caracterIngresado;
                    posConsonante++;
                        
                    
                }
    
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("consonantes:"+consonantes[i]);
            System.out.println("vocales:"+vocales[i]);

            
        }
        

        
    }
    
}
