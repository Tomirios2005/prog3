package ejercicio2;

public class CondicionCantPalabras extends Condicion{
    private final int cantPalabras;
    public CondicionCantPalabras(int cantPalabras){
        this.cantPalabras=cantPalabras;
        

    }
    public boolean cumple(Documento doc){
        return doc.contadorDePalabras()<this.cantPalabras;
    }
    
    
}
