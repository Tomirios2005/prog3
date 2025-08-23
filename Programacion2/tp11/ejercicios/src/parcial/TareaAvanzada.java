package parcial;

public class TareaAvanzada extends TareaCompleja{
    public TareaAvanzada(String nombre) {
        super(nombre);
    }

    @Override
    public int getTiempo() {
        int tiempo=0;
        for (Trabajo tt: super.getTrabajos()){
            if (tt.getTiempo()>tiempo){
                tiempo=tt.getTiempo();
            }
        }
        return tiempo;

    }

    @Override
    public int getCantEmpleados() {
        int empleados=0;
        for (Trabajo tt:super.getTrabajos()){
            empleados+=tt.getCantEmpleados();
        }
        return empleados;

    }

}
