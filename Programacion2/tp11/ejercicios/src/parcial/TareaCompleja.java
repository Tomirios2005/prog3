package parcial;

import parcial.Calculadores.Calculador;
import parcial.filtros.Condicion;

import java.util.ArrayList;

public class TareaCompleja extends Trabajo{
    private ArrayList<Trabajo>presupuestos;

    public TareaCompleja(String nombre) {
        super(nombre);
        presupuestos=new ArrayList<>();
    }
    public void addPresupuesto(Trabajo tt){
        presupuestos.add(tt);
    }

    @Override
    public boolean necesitaMaterial(String material) {
        for (Trabajo tra:presupuestos){
            if (tra.necesitaMaterial(material)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int getCantEmpleados() {
        int contador=0;
        for(Trabajo tra:presupuestos){
            if (tra.getCantEmpleados()>contador){
                contador=tra.getCantEmpleados();

            }
        }
        return contador;

    }

    @Override
    public int getTiempo() {
        int tiempo=0;
        for (Trabajo tra:presupuestos){
            tiempo+=tra.getTiempo();
        }
        return tiempo;
    }

    protected ArrayList<Trabajo>getTrabajos() {
        ArrayList<Trabajo>retorno=new ArrayList<>(presupuestos);
        return retorno;

    }

    @Override
    public ArrayList<Trabajo> buscar(Condicion cc) {
        ArrayList<Trabajo>retorno=new ArrayList<>();
        for (Trabajo tt:presupuestos){
            if (cc.cumple(tt)){
                retorno.add(tt);
            }


        }
        return retorno;
    }

    @Override
    public int getCosto(Calculador calc) {
        int costo=0;
        for(Trabajo tt: presupuestos){
            costo+=tt.getCosto(calc);
        }
        return costo;
    }
}
