import java.util.ArrayList;

public class Carta {
    private Ninio remitente;
    private ArrayList<String> regalos;

    public Carta(Ninio remitente) {
        this.remitente = remitente;
        regalos=new ArrayList<>();
    }
    public void addRegalos(String regalo){
        if(!regalos.contains(regalo)){
            regalos.add(regalo);
        }
    }

    public Ninio getRemitente() {
        return remitente;
    }
    public ArrayList<String> getRegalos(){
        ArrayList<String>retorno=new ArrayList<>(this.regalos);
        return retorno;
    }
    public void carbonizarRegalos(){
        this.regalos.clear();
        this.regalos.add("carbon");
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Carta cc=(Carta)obj;
            if (cc.getRemitente().equals(cc.getRemitente())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
