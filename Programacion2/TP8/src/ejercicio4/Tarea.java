package ejercicio4;

import java.util.ArrayList;

public abstract class Tarea {

    public abstract double getCosto();
    public abstract int getTiempo();
    public abstract ArrayList<String> getAcciones();
    public boolean equals(Object o1){
        Tarea tt=(Tarea)o1;
        return tt.getAcciones().equals(this.getAcciones());
    }
}
