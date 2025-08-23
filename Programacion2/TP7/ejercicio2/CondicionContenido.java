package ejercicio2;

public class CondicionContenido extends Condicion {
    private final String frase;
    public CondicionContenido(String frase) {
        this.frase = frase;
    }
    public boolean cumple(Documento doc){
        return doc.getTexto().contains(frase);
    }


    
}
