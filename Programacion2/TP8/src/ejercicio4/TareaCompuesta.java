package ejercicio4;

import java.util.ArrayList;

public class TareaCompuesta extends Tarea {
    private String especialidad;
    private ArrayList<Tarea> tareas;

    public TareaCompuesta(String especialidad) {
        this.especialidad = especialidad;
        this.tareas=new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void addTarea(Tarea tarea){
        if (!tareas.contains(tarea)){
            tareas.add(tarea);
        }
    }

    @Override
    public double getCosto() {
        double costo =0;
        for(Tarea tt:tareas){
            costo+=tt.getCosto();
        }
        return costo;
    }

    @Override
    public int getTiempo() {
        int tiempo =0;
        for(Tarea tt:tareas){
            tiempo+=(tt.getTiempo()+10);
        }
        return tiempo;
    }
    public ArrayList<String> getAcciones(){
        ArrayList<String>acciones=new ArrayList<>();
        for(Tarea tt:tareas){
            if (!acciones.contains(tt.getAcciones().get(0))){
                acciones.add(tt.getAcciones().get(0));
            }
        }
        return acciones;
    }
}
