package PuertoCerealesV2;

import java.util.ArrayList;

public class Puerto {
    private ArrayList <Vehiculo> camiones;
    private ArrayList <Vehiculo> barcos;
    
    public Puerto(){
        camiones=new ArrayList<>();
        barcos=new ArrayList<>();
    }
    public void addCamion(Camion camion){
        camiones.add(camion);
        for (int i = 0; i < camiones.size()-1; i++) {
            for (int j = i+1; j < camiones.size(); j++) {
                if (camiones.get(j).tienePrioridad(camiones.get(i))) {
                    Vehiculo temp=camiones.get(i);
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
                    Vehiculo temp=barcos.get(i);
                    barcos.set(i, barcos.get(j));
                    barcos.set(j, temp);
                    
                }
                
            }
            
        }
    }

    public ArrayList<Vehiculo> getBarcos() {
        return barcos;
    }
    public ArrayList<Vehiculo> getCamiones() {
        return camiones;
    }
    
}
