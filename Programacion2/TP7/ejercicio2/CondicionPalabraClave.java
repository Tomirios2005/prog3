package ejercicio2;

public class CondicionPalabraClave extends Condicion {
    private final String palabraClave;
    public CondicionPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }
    public boolean cumple(Documento doc){
        return doc.contienePalabraClave(palabraClave);
    }
    
}
