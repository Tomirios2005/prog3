package parcial2;

import parcial2.filtros.Condicion;

import java.util.ArrayList;

public class PiezaCompuesta extends Pieza{
    private ArrayList<Pieza>piezas;
    private int tiempoAdicional;
    private int plaAdicional;

    public PiezaCompuesta(String nombre, String descripcion, int tiempoAdicional, int plaAdicional) {
        super(nombre, descripcion);
        piezas=new ArrayList<>();
        this.tiempoAdicional=tiempoAdicional;
        this.plaAdicional=plaAdicional;
    }
    public void addPieza(Pieza pp){
        piezas.add(pp);
    }

    @Override
    public int getCantPLA() {
        int pla=0;
        for (Pieza pp:piezas){
            pla+=pp.getCantPLA();
        }
        return pla;
    }

    @Override
    public int getTiempo() {
        int tiempo=tiempoAdicional;
        for (Pieza pp:piezas){
            tiempo+=pp.getTiempo();
        }
        return tiempo;
    }

    @Override
    public ArrayList<Pieza> buscar(Condicion cc) {
        ArrayList<Pieza>retorno=new ArrayList<>();
        for (Pieza pp:piezas){
            retorno.addAll(pp.buscar(cc));
        }
        return retorno;
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String>colores=new ArrayList<>();
        for (Pieza pp : piezas){
            if (!colores.containsAll(pp.getColores())){
                colores.addAll(pp.getColores());
            }
        }
        return colores;
    }

    public int getTiempoAdicional() {
        return tiempoAdicional;
    }

    public void setTiempoAdicional(int tiempoAdicional) {
        this.tiempoAdicional = tiempoAdicional;
    }

    public int getPlaAdicional() {
        return plaAdicional;
    }

    public void setPlaAdicional(int plaAdicional) {
        this.plaAdicional = plaAdicional;
    }


}
