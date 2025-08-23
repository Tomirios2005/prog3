package SistemadeAlquiler;

import java.time.LocalDate;

public class Ejecutable {
    public static void main(String[] args) {
       SistemaAlquiler sistema= new SistemaAlquiler();
       Item p1=new Pelicula(LocalDate.of(2024, 01, 31), 10000, 5, "La bella y la bestia");
       Item auto1 = new Vehiculo(LocalDate.of(2025, 01, 31), 200000, "Volkswagen", "ae052fr",100,"naftero");

       Cliente c1= new Cliente("Tomas", 46568155);
       sistema.setClientes(c1);
       sistema.setItems(auto1);
       c1.addAlquiler(auto1);
       c1.addAlquiler(p1);
       System.out.println(sistema.alquileresVencidos());
       
    }
    
}
