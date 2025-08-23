package ejercicio3;

public class CondicionNombreVulgar extends Condicion{
    private final String nombreVulgar;

    public CondicionNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    @Override
    public boolean cumple(Planta pp) {
        return pp.tieneNombreVulgar(nombreVulgar);
    }
}
