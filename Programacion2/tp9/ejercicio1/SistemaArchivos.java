import java.util.ArrayList;

public class SistemaArchivos {
    private ArrayList<ArchivoGenerico>archivos;

    public SistemaArchivos() {
        this.archivos = new ArrayList<>();
    }
    public void addArchivo(ArchivoGenerico archivo){
        if (!archivos.contains(archivo)){
            archivos.add(archivo);
        }
    }
    public ArrayList<ArchivoGenerico>buscarArchivo(Condicion condicion){
        ArrayList<ArchivoGenerico>retorno=new ArrayList<>();
        for(ArchivoGenerico archivo:archivos){
            if (condicion.cumple(archivo)){
                retorno.add(archivo);
            }
        }
        return retorno;
    }
}
