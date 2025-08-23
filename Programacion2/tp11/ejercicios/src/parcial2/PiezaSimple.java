package parcial2;

import parcial2.filtros.Condicion;

import java.util.ArrayList;

public class PiezaSimple extends Pieza{
    private int cantPLA;
    private int tiempo;
    private String color;

    public PiezaSimple(String nombre, String descripcion, int cantPLA, int tiempo, String color) {
        super(nombre, descripcion);
        this.cantPLA = cantPLA;
        this.tiempo = tiempo;
        this.color = color;
    }

    public int getCantPLA() {
        return cantPLA;
    }

    public void setCantPLA(int cantPLA) {
        this.cantPLA = cantPLA;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public ArrayList<Pieza> buscar(Condicion cc) {
        ArrayList<Pieza>retorno=new ArrayList<>();
        if (cc.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String>retorno=new ArrayList<>();
        retorno.add(this.color);
        return retorno;
    }
}
