package CentroDeComputos;

public class Proceso {
    private int requisitoMemoria;
    public Proceso(int memoria){
        requisitoMemoria=memoria;
    }
    public int getRequisitoMemoria(){
        return requisitoMemoria;
    }
    public void setRequisitoMemoria(int memoria){
        requisitoMemoria=memoria;

    }
    public String toString(){
        return "tarea"+"("+ requisitoMemoria+")";
    }



    
}
