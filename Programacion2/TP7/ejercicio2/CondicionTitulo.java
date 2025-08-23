package ejercicio2;

public class CondicionTitulo extends Condicion {
    private final String titulo;
    public CondicionTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean cumple(Documento doc){
        return doc.getTitulo().equalsIgnoreCase(this.titulo);
    }
    
}
