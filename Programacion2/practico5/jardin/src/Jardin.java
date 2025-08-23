import java.util.ArrayList;
public class Jardin {

    private ArrayList<Planta> plantas;
    public Jardin(){
        this.plantas = new ArrayList<>();
    }
    public void agregarPlanta(String nombreCientifico, String nombreComun, String paisOrigen, String fechadeCompra) {
        plantas.add(new Planta(nombreCientifico, nombreComun, paisOrigen, fechadeCompra));
    }

    public void listarPlantas(){
        System.out.println("las plantas del jardin son:");
        for (Planta planta : plantas) {
            System.out.println(planta);
            
        }
    }
    

    
}
