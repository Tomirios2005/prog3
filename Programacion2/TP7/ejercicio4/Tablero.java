package ejercicio4;

import java.util.ArrayList;

public class Tablero {
    private int puntajeMinimo;
    private ArrayList<Ficha> fichas;

    public Tablero(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
        fichas=new ArrayList<>();
    }

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }
    public void addFichas(Ficha ficha){
        if (!fichas.contains(ficha)){
            fichas.add(ficha);
        }
    }
    public int getDificultad(){
         int sumaFortaleza=0;
         int sumaDestruccion=0;
        for (Ficha f : fichas){
            sumaFortaleza+=f.getFortaleza();
            sumaDestruccion=f.getPoderDestruccion();


        }
        return sumaFortaleza/sumaDestruccion;
    }
    public ArrayList<Ficha> buscarFicha(Condicion cc){
        ArrayList<Ficha>retorno=new ArrayList<>();
        for(Ficha f:fichas){
            if (cc.cumple(f)){
                retorno.add(f);


            }
        }
        return retorno;
    }
}
