import java.util.ArrayList;

public class PiezaCompuesta extends Pieza {
    private ArrayList<Pieza>piezas;

    public PiezaCompuesta(String nombre, String descripcion, ArrayList<Pieza> piezas) {
        super(nombre, descripcion);
        this.piezas = new ArrayList<>();
    }
    public void addPieza(Pieza pieza){
        piezas.add(pieza);
    }

    @Override
    public int calcularTiempo() {
        int tiempo =45;
        for (Pieza pieza:piezas){
            tiempo+=pieza.calcularTiempo();
        }
        return tiempo;
    }

    @Override
    public int calcularPLA() {
        int cantPLA=1;
        for ()
    }
}
