import java.util.ArrayList;

public class ArchivoComprimido extends ArchivoGenerico{
    private int tasaCompresion;
    private ArrayList<ArchivoGenerico> contenido;

    public ArchivoComprimido(String nombre, int tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
        this.contenido=new ArrayList<>();
    }
    public void addContenido(ArchivoGenerico aa){
        if (!contenido.contains(aa)){
            contenido.add(aa);
        }
    }

    public int getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(int tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio() {
        double tamanio=0;
        for(ArchivoGenerico archivo:contenido){
            tamanio+=archivo.getTamanio();
        }
        return tamanio/tasaCompresion;
    }
}
