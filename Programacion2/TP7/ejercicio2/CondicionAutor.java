package ejercicio2;

public class CondicionAutor  extends Condicion{
    private final Autor autor;
    public CondicionAutor(Autor autor) {
        this.autor = autor;
    }
    public boolean cumple(Documento doc){
        return doc.getAutores().equals(autor);
    }
    
}
