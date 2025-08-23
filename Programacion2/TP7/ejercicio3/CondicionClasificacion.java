package ejercicio3;

public class CondicionClasificacion extends Condicion{
    private final String clasificacion;

    public CondicionClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean cumple(Planta pp) {
        return pp.getClasificacionSuperior().equalsIgnoreCase(this.clasificacion);
    }
}
