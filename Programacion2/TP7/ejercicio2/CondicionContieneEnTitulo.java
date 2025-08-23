package ejercicio2;

public class CondicionContieneEnTitulo extends Condicion{
    private final String frase;
    public CondicionContieneEnTitulo(String frase) {
        this.frase = frase;
    }
    public boolean cumple(Documento doc){
        return doc.getTitulo().toLowerCase().contains(frase.toLowerCase());
    }
    
}
