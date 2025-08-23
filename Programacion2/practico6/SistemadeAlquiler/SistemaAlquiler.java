package SistemadeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaAlquiler {
    private ArrayList <Item> items;
    private ArrayList <Cliente> clientes;
    public SistemaAlquiler() {
        this.items = new ArrayList <Item>();
        this.clientes = new ArrayList<Cliente>();
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(Item item) {
        this.items.add(item);
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
   
    public ArrayList<Cliente> alquileresVencidos(){
        ArrayList <Cliente> alquileresVencidos = new ArrayList<Cliente>();
        
        for (Cliente cliente : clientes) {
           for(Item item:cliente.getAlquileres()){
            if (LocalDate.now().isAfter(item.getFechaLimite())) {
                alquileresVencidos.add(cliente);
                break;
            }

           } 


            
        }
        return alquileresVencidos;
    }
    
    

}
