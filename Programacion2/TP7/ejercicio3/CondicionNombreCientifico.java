package ejercicio3;


public class CondicionNombreCientifico extends Condicion {
    private final String nombreCientifico;

    public CondicionNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public boolean cumple(Planta pp) {
        return pp.getNombreCientifico().equalsIgnoreCase(this.nombreCientifico);
    }
}
