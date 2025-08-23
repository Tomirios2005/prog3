package CentroDeComputos;

public class Ejecutable {
    public static void main(String[] args) {
        CentroComputos c1=new CentroComputos();
        ColaPrioridad cola=new ColaPrioridad();
        c1.addCola(cola);
        Proceso counter=new Proceso(10);
        Proceso minecraft=new Proceso(200);
        Proceso fortnite=new Proceso(10);
        Computadora pc=new Computadora();
        c1.addComputadora(pc);
        c1.agregarProceso(fortnite);
        c1.agregarProceso(minecraft);
        c1.agregarProceso(counter);
        // pc.addProcesos(c1.getProcesos());
        System.out.println(c1.getProcesos());
        // System.out.println(c1.getCola());

    }
    
}
