public  class Ninio {
    private int dni;
    private Carta carta;

    public Ninio(int dni, Carta carta) {

        this.dni = dni;
        this.carta=carta;
    }

    public int getDni() {

        return dni;
    }

    public void setDni(int dni) {

        this.dni = dni;
    }

    public Ninio(Carta carta) {
        this.carta = carta;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Ninio n=(Ninio)obj;
            if (n.getDni()==this.getDni()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}

