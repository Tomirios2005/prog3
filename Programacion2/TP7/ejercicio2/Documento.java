package ejercicio2;
import java.util.ArrayList;

public class Documento {
    private final String titulo;
    private final ArrayList <Autor> autores;
    private final String texto;
    private final ArrayList<String> palabrasClave;
    public Documento(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.autores=new ArrayList<>();
        this.palabrasClave=new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }
    
    public String getTexto() {
        return texto;
    }
    public void addAutor(Autor autor){
        if (!autores.contains(autor)) {
            autores.add(autor);
            
        }
    }
    public void addPalabraClave(String cc){
        if (!palabrasClave.contains(cc)) {
            palabrasClave.add(cc);
            
        }
    }
    protected boolean contienePalabraClave(String palabra){
        return this.palabrasClave.contains(palabra);
        


    }
    protected ArrayList<Autor> getAutores(){
        ArrayList<Autor> retorno=new ArrayList<>(this.autores);
        return retorno;
    }
    protected int contadorDePalabras(){
        char[] aCaracteres=this.texto.toCharArray();
        int contador=0;
        for (char c : aCaracteres) {
            if (c!=' ') {
                contador++;
                
            }

            
        }
        return contador;
    }
    
    


}
