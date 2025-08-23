package CentroDeComputos;

import java.util.ArrayList;

public class Computadora {
    private boolean disponible;
    private ArrayList<Proceso>procesos;

    public Computadora(){
        disponible=false;
        procesos= new ArrayList<Proceso>();
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public ArrayList<Proceso> getProcesos() {
        return procesos;
    }

    public void addProcesos(ArrayList<Proceso> procesosOrdenados) {
        procesos=procesosOrdenados;
    }
    

    
    
}
