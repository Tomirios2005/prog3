package ejercicio2;

import java.util.ArrayList;
/* los cultivos son capaces de decir si en algún momento
puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus enfermedades
frecuentes y no se desaconseja su uso en el cultivo. Se considera que el agroquímico trata una
enfermedad si todos los estados patológicos de la enfermedad están contenidos por las acciones
del producto químico. */

public class Cultivo {
    private String nombre;
    private final ArrayList<Enfermedad> enfermedades;

    
    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedades = new ArrayList<Enfermedad>();
    }
    public boolean esDeUtilidad(ProductoQuimico prod){

        ArrayList<Cultivo> cultivos = prod.getCultivosNoRecomendados();
        for(int i = 0; i < cultivos.size(); i++){
            Cultivo cult = cultivos.get(i);
            if (this.getNombre().equals(cult.getNombre())) {
                return false;
            }
        }
        for (int i = 0; i < this.enfermedades.size(); i++) {
            if (chequearEnfermedad(prod, this.enfermedades.get(i))) {
                return true;
            }
        }
        return false;
    }
    public boolean chequearEnfermedad(ProductoQuimico prod, Enfermedad enf) {
        return prod.getEstadosPatologicos().containsAll(enf.getEstadosPatologicos());
    }

    public void addEnfermedad(Enfermedad enf){
        if (!this.enfermedades.contains(enf)) {
            this.enfermedades.add(enf);
        }
    }

    public void removeEnfermedad(Enfermedad enf){
        if (!this.enfermedades.contains(enf)) {
            this.enfermedades.remove(enf);
        }
    }
    public boolean equals(Object o1){
        if (o1 instanceof Cultivo cult) {
            return cult.getNombre().equals(this.getNombre());
        }
        return false;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
