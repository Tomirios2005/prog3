package parcial;

import parcial.Calculadores.Calculador;
import parcial.filtros.Condicion;

import java.util.ArrayList;

public class PresuBasico extends Trabajo{
    private ArrayList<String>materiales;
    private int cantEmpleados;
    private int tiempoEstimado;

    public PresuBasico(String nombre, int cantEmpleados, int tiempoEstimado) {
        super(nombre);
        this.cantEmpleados = cantEmpleados;
        this.tiempoEstimado = tiempoEstimado;
        materiales=new ArrayList<>();
    }
    public void addMaterial(String material){
        materiales.add(material);
    }

    @Override
    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }


    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public boolean necesitaMaterial(String material) {
        return materiales.contains(material);
    }

    @Override
    public int getTiempo() {
        return tiempoEstimado;
    }

    @Override
    public ArrayList<Trabajo> buscar(Condicion cc) {
        ArrayList<Trabajo>retorno=new ArrayList<>();
        if (cc.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }

    @Override
    public int getCosto(Calculador calc) {
        return calc.calcCosto(this);
    }
}
