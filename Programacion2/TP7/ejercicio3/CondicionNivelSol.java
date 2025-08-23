package ejercicio3;

public class CondicionNivelSol extends CondicionNivelSuperior{
    public CondicionNivelSol(int nivel){
        super(nivel);
    }
    @Override
    public boolean superior(Planta pp, int nivel) {
        return pp.getSol()>nivel;
    }
}
