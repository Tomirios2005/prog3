package CentroDeComputos;

import java.util.ArrayList;

public class CentroComputos {
    private ArrayList <Computadora> computadoras;
    private ArrayList <Proceso> procesos;
    private ColaPrioridad cola;
    public CentroComputos() {
        computadoras=new ArrayList<Computadora>();
        procesos=new ArrayList<Proceso>();
        cola=new ColaPrioridad();
    }
    public void agregarProceso(Proceso proceso){
        procesos.add(proceso);
        procesos=cola.ordenarProcesos(procesos);


    }
    public ArrayList <Proceso> getProcesos(){
        return procesos;
    }
    public ColaPrioridad getCola(){
        return cola;
    }
    public ArrayList<Computadora> geComputadoras(){
        return computadoras;

    }
    public void addComputadora(Computadora pc){
        computadoras.add(pc);
    }
    public void addCola(ColaPrioridad c){
        cola=c;
    }

    

}
