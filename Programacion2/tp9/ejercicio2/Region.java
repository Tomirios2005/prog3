import java.util.ArrayList;

public abstract class Region {
    private ArrayList<Buzon>buzones;

    public Region() {
        this.buzones = new ArrayList<>();
    }

    public void addBuzon(Buzon buzon){
        if (!buzones.contains(buzon)){
            buzones.add(buzon);

        }
    }
    public abstract double getPorcentaje(Condicion cc);



}
