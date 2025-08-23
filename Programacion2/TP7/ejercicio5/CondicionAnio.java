package ejercicio5;

public class CondicionAnio extends Condicion {
    private int anio;

    public CondicionAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pelicula pp) {
        return pp.getAnioEstreno()<this.anio;
    }
}
