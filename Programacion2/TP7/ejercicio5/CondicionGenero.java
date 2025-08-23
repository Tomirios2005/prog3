package ejercicio5;

public class CondicionGenero extends Condicion{
    private String genero;

    public CondicionGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pp) {
        return pp.tieneGenero(genero);
    }
}
