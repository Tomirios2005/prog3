package CentroDeComputos;

import java.util.ArrayList;

public class ColaPrioridad {
    private ArrayList <Proceso> procesos;
    public ColaPrioridad(){
        procesos=new ArrayList<Proceso>();
    }
    public ArrayList <Proceso> ordenarProcesos(ArrayList <Proceso> procesos1){
         ArrayList <Proceso> auxAordenar = new ArrayList<Proceso>(procesos1);
         for (int i = 0; i < auxAordenar.size()-1; i++) {
            for (int j = i+1; j < auxAordenar.size(); j++) {
                if (auxAordenar.get(j).getRequisitoMemoria()>auxAordenar.get(i).getRequisitoMemoria()) {
                    Proceso temp = auxAordenar.get(i);

                    auxAordenar.set(i, auxAordenar.get(j));
                    auxAordenar.set(j,temp);
                  
                    
                }
                
            }
            
         }
        procesos= new ArrayList<Proceso>(auxAordenar);
         return procesos;
         


    }
    public String toString(){
        String pr="";
        for (Proceso proceso : procesos) {
           pr+=proceso.getRequisitoMemoria()+",";
        }
        return pr;

    }
    
}
