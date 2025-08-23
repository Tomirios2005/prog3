package ej6;

import ej6.Filtros.Condicion;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionTematica implements Coleccionable{
    private ArrayList<Coleccionable>coleccionables;
    private boolean esRestrictiva;
    private int descuento;

    public ColeccionTematica(boolean esRestrictiva, int descuento) {
        coleccionables=new ArrayList<>();
        this.esRestrictiva=esRestrictiva;
        this.descuento=descuento;
    }
    public void addColeccionable(Coleccionable cc){
        coleccionables.add(cc);

    }

    public boolean isEsRestrictiva() {
        return esRestrictiva;
    }

    public void setEsRestrictiva(boolean esRestrictiva) {
        this.esRestrictiva = esRestrictiva;
    }

    @Override
    public double getPrecio() {
        double precio=0;
        for (Coleccionable cc:coleccionables){
            precio+=cc.getPrecio();
        }
        return precio-precio*descuento/100;
    }


    @Override
    public ArrayList<Figurita> buscar(Condicion cc) {
        ArrayList<Figurita>retorno=new ArrayList<>();
        if (esRestrictiva){
            return retorno;

        }
        for (Coleccionable coleccionable:coleccionables){
            retorno.addAll(coleccionable.buscar(cc));
        }
        Collections.sort(retorno);
        return retorno;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
