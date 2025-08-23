package parcial;

import parcial.filtros.Condicion;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Trabajo>trabajos;

    public Empresa() {
        trabajos=new ArrayList<>();
    }
    public void addTrabajo(Trabajo tt){
        trabajos.add(tt);
    }
    public ArrayList<Trabajo>buscar(Condicion cc){
        ArrayList<Trabajo>retorno=new ArrayList<>();
        for (Trabajo tt : trabajos){
            if (cc.cumple(tt)){
                retorno.add(tt);
            }else{
                retorno.addAll(tt.buscar(cc));
            }

        }
        return retorno;
    }
}
