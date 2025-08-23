package ejercicio2;

import java.util.ArrayList;

public class ComboPostal extends Item {
    private ArrayList<Item>envios;
    private static int contador=100;
    private String ciudadDestino;
    public ComboPostal(String ciudadDestino){
        super("", "", "", "", true, 0, contador++);
        envios=new ArrayList<>();
        this.ciudadDestino=ciudadDestino;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void addEnvios(Item item){
        if (!envios.contains(item)&&item.getDireccionDestinatario().contains(this.ciudadDestino)) {
            envios.add(item);
            item.setTracking(contador - 1);
            this.setDestinatario(envios.get(0).getDestinatario());
            this.setDireccionDestinatario(envios.get(0).getDireccionDestinatario());
            this.setRemitente(envios.get(0).getRemitente());
            this.setDireccionRemitente(envios.get(0).getDireccionRemitente());
            this.setPeso(this.getPeso());
        }





    }
    public int getPeso(){
        int peso=0;
        for (Item i:envios){
            peso+=i.getPeso();
        }
        return peso;
    }
}
