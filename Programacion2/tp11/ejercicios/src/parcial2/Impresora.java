package parcial2;

import parcial2.filtros.Condicion;

import java.util.ArrayList;

public class Impresora {
    private ArrayList<Pieza>piezas;
    public Impresora(){
        piezas=new ArrayList<>();
    }
    public ArrayList<Pieza>buscar(Condicion cc){
        ArrayList<Pieza>retorno=new ArrayList<>();
        for (Pieza pp:piezas){
            if (cc.cumple(pp)){
                retorno.add(pp);
            }
        }
        return retorno;
    }

    public static void main(String[] args) {
        Impresora i1=new Impresora();

    }

}
