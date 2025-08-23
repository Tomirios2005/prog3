package parcial2;

import parcial2.filtros.Condicion;


public class PiezaEspecial extends PiezaCompuesta{
    private Condicion condicion;

    public PiezaEspecial(String nombre, String descripcion, int tiempoAdicional, int plaAdicional, Condicion condicion) {
        super(nombre, descripcion, tiempoAdicional, plaAdicional);
        this.condicion = condicion;
    }
    public void addPieza(Pieza pp){
        if (condicion.cumple(pp)){
            super.addPieza(pp);
        }
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }
}
