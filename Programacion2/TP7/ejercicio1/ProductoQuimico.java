package ejercicio2;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private final ArrayList<Cultivo> cultivosNoRecomendados;
    private final ArrayList<String> estadosPatologicos;

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivosNoRecomendados = new ArrayList<Cultivo>();
        this.estadosPatologicos = new ArrayList<String>();
    }

    public ArrayList<Cultivo> getCultivosNoRecomendados() {
        return new ArrayList<Cultivo>(this.cultivosNoRecomendados);
    }

    public ArrayList<String> getEstadosPatologicos() {
        return new ArrayList<String>(this.estadosPatologicos);
    }

    public int getSizeCultivos() {
        return this.cultivosNoRecomendados.size();
    }

    public void addCultivoNoRecomendado(Cultivo cult) {
        if (!this.cultivosNoRecomendados.contains(cult)) {
            this.cultivosNoRecomendados.add(cult);
        }
    }

    public boolean puedeTratarEnfermedad(Enfermedad enf) {
        return this.estadosPatologicos.containsAll(enf.getEstadosPatologicos());
    }

    public void removeCultivoNoRecomendado(Cultivo cult) {
        if (!this.cultivosNoRecomendados.contains(cult)) {
            this.cultivosNoRecomendados.remove(cult);
        }
    }

    public void addEstadoPatologico(String estado) {
        if (!this.estadosPatologicos.contains(estado)) {
            this.estadosPatologicos.add(estado);
        }
    }

    public void removeEstadoPatologico(String estado) {
        this.estadosPatologicos.remove(estado);
    }

    public String getNombre() {
        return nombre;
    }

    public boolean equals(Object o1){
        if (o1 instanceof ProductoQuimico pq) {
            return pq.getNombre().equals(this.getNombre());
        }
        return false;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
