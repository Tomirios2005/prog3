package ejercicio4;

import java.util.ArrayList;

public class TareaSimple extends Tarea {
    private String accion;
    private double costo;
    private int tiempo;

    public TareaSimple(String accion, double costo, int tiempo) {
        this.accion = accion;
        this.costo = costo;
        this.tiempo = tiempo;
    }

    public ArrayList<String> getAcciones() {
        ArrayList<String>retorno=new ArrayList<>();
        retorno.add(this.accion);
        return retorno;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
