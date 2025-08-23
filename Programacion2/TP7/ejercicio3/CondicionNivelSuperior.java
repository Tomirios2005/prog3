package ejercicio3;

public abstract class CondicionNivelSuperior extends Condicion{
    private final int nivel;
    public CondicionNivelSuperior(int nivel){
        this.nivel=nivel;
    }
    @Override
    public boolean cumple(Planta pp){
        return this.superior(pp, nivel);
    }
    public abstract boolean superior(Planta pp, int nivel);
}
