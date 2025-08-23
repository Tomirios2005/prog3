import java.util.ArrayList;

public class Directorio extends ArchivoGenerico{
    private ArrayList<ArchivoGenerico>contenido;

    public Directorio(String nombre, ArrayList<ArchivoGenerico> contenido) {
        super(nombre);
        this.contenido = new ArrayList<>();
    }
    public void addContenido(ArchivoGenerico archivo){
        if (!contenido.contains(archivo)){
            contenido.add(archivo);
        }
    }

    @Override
    public double getTamanio() {
        double tamanio=0;
        for(ArchivoGenerico aa:contenido){
            tamanio+=aa.getTamanio();
        }
        return tamanio;
    }

}
