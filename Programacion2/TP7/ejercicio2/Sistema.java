package ejercicio2;

import java.util.ArrayList;

public class Sistema {
    private final ArrayList<Documento> documentos;
    public Sistema(){
        documentos=new ArrayList<>();
    }
    public void addDocumentos(Documento doc){
        if (!documentos.contains(doc)) {
            documentos.add(doc);
            
        }
    }
    public ArrayList<Documento> buscar(Condicion condicion){
        ArrayList<Documento> docsAMostrar=new ArrayList<>();
        for (Documento documento : documentos) {
            if (condicion.cumple(documento)) {
                docsAMostrar.add(documento);
                
            }
            
        }
        return docsAMostrar;
    }


    
}
