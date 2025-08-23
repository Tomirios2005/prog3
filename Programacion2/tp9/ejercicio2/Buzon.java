import java.util.ArrayList;

public class Buzon {
    private ArrayList<Ninio>niniosBuenos;
    private ArrayList<Carta>cartas;

    public Buzon() {
        this.niniosBuenos = new ArrayList<>();
        this.cartas = new ArrayList<>();
    }
    public void addNiniosBuenos(Ninio ninio){
        if (!niniosBuenos.contains(ninio)){
            niniosBuenos.add(ninio);
        }
    }
    public void addCarta(Carta carta){
        if (!niniosBuenos.contains(carta.getRemitente())){
            carta.carbonizarRegalos();
        }
        if (!cartas.contains(carta)){
            cartas.add(carta);

        }

    }
    private ArrayList<Ninio>getNiniosBuenos(){
        return this.niniosBuenos;
    }

    @Override
    public boolean equals(Object obj) {
        Buzon buzon=(Buzon) obj;
        return this.getNiniosBuenos().containsAll(buzon.getNiniosBuenos());
    }
}
