import java.util.ArrayList;

public abstract class Articulo {
    private String nombre;
    private int anioFabricacion;
    private ArrayList<String>listaMateriales;
    private String fabricante;
    private int peso;

    public Articulo(String nombre, int anioFabricacion, String fabricante, int peso) {
        this.nombre = nombre;
        this.anioFabricacion = anioFabricacion;
        this.fabricante = fabricante;
        this.peso = peso;
        listaMateriales=new ArrayList<>();
    }
    public void addMaterial(String material){
        if (!listaMateriales.contains(material)){
            listaMateriales.add(material);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    public boolean tieneMaterial(String material) {
        return this.listaMateriales.contains(material);
    }
    public String toString(){
        return this.getNombre();

    }
    public boolean equals(Object oo){
        try {
            Articulo tt=(Articulo)oo;
            if (tt.getNombre().equals(this.getNombre())){
                return true;
            }else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
