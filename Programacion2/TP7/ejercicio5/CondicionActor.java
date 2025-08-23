package ejercicio5;

public class CondicionActor extends Condicion{
    private String actor;

    public CondicionActor(String actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula pp) {
        return pp.tieneActor(actor);
    }
}
