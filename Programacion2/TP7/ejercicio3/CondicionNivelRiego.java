package ejercicio3;

public class CondicionNivelRiego extends CondicionNivelSuperior {
    public CondicionNivelRiego(int nivel){
        super(nivel);
    }

    @Override
    public boolean superior(Planta pp, int nivel) {
        return pp.getRiego()>nivel;
    }
}
