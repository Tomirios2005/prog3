package ejercicio3;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private final ArrayList<String>nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private final String habitat;
    private int riego;
    private int sol;
    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, String habitat, int riego, int sol) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.habitat=habitat;
        this.riego=riego;
        this.sol=sol;
        nombresVulgares=new ArrayList<>();

    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    
    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }
    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public void addNombreVulgar(String nombre){
        if (!this.nombresVulgares.contains(nombre)) {
            this.nombresVulgares.add(nombre.toLowerCase());
            
        }
    }
    public boolean tieneNombreVulgar(String nombre){
        return nombresVulgares.contains(nombre.toLowerCase());
    }
    public boolean equals(Object oo){
        try{
            Planta p =(Planta)oo;
            return p.getNombreCientifico().equalsIgnoreCase(this.getNombreCientifico());
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
    public String toString(){
        return this.getNombreCientifico();
    }

    
}
