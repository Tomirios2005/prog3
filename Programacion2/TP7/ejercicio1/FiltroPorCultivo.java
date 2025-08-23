package ejercicio2;

public class FiltroPorCultivo extends Filtro {
    
    private Cultivo cultivo;

    public boolean cumple(ProductoQuimico pq){
        return cultivo.esDeUtilidad(pq);
    }

    public FiltroPorCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    public Cultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    
}
