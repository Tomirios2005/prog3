package ejercicio2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Correo {
    private ArrayList<Item>envios;
    public Correo(){
        envios=new ArrayList<>();
    }
    public void addEnvios(Item item){
        if (!envios.contains(item)){
            envios.add(item);
        }
    }
    public ArrayList<Item>buscarEnvios(int tracking){
        ArrayList<Item>retorno=new ArrayList<>();
        for (Item i:envios){
            if (i.getTracking()==tracking){
                retorno.add(i);
            }
        }
        return retorno;
    }

    public static void main(String[] args) {
        Item guitarra=new Item("Tomas","gorriti129, buenos aires","juan","carasd 120", 50);
        Item piano=new Item("joaquin","gorriti129123, buenos aires","romulo","carasd 1221", 100);
        Item aspiradora=new Item("mariano","la plata","ricardo","la plata", 100);
        ComboPostal combo = new ComboPostal("buenos aires");
        combo.addEnvios(piano);
        combo.addEnvios(guitarra);
        combo.addEnvios(aspiradora);
        System.out.println("tracking combo: "+ combo.getTracking()+" , tracking aspiradora: "+aspiradora.getTracking()+"tracking guitarra: "+ guitarra.getTracking());

    }
}
