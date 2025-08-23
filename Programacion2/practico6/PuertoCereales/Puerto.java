package PuertoCereales;

import java.util.ArrayList;

public class Puerto {
    private ArrayList <Camion> camiones;
    private ArrayList <Barco> barcos;
    
    public Puerto(){
        camiones=new ArrayList<>();
        barcos=new ArrayList<>();
    }
    public void addcamion(Camion camion){
        camiones.add(camion);
        for (int i = 0; i < camiones.size()-1; i++) {
            for (int j = i+1; j < camiones.size(); j++) {
                if (camiones.get(j).tienePrioridad(camiones.get(i))) {
                    Camion temp=camiones.get(i);
                    camiones.set(i, camiones.get(j));
                    camiones.set(j, temp);
                    
                }
                
            }
            
        }
    }
   
    
    public void addBarco(Barco barco){
        barcos.add(barco);
        for (int i = 0; i < barcos.size()-1; i++) {
            for (int j = i+1; j < barcos.size(); j++) {
                if (barcos.get(j).tienePrioridad(barcos.get(i))) {
                    Barco temp=barcos.get(i);
                    barcos.set(i, barcos.get(j));
                    barcos.set(j, temp);
                    
                }
                
            }
            
        }
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }
    public ArrayList<Camion> getCamiones() {
        return camiones;
    }
    
}
