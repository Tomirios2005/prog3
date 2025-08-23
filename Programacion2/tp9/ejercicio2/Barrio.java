public class Barrio extends ServicioPostal {
    private Buzon buzon;

    public Barrio(Buzon buzon) {
        this.buzon = buzon;
    }

    public Buzon getBuzon() {
        return buzon;
    }

    public void setBuzon(Buzon buzon) {
        this.buzon = buzon;
    }
}
