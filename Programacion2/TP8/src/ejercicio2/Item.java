package ejercicio2;

public class Item {
    private String destinatario, direccionDestinatario, remitente, direccionRemitente;
    private boolean envioASucursal;
    private int peso;
    private static int contador=1;
    private int tracking;

    public Item(String destinatario, String direccionDestinatario, String remitente, String direccionRemitente,int peso) {
        this.destinatario = destinatario;
        this.direccionDestinatario = direccionDestinatario.toLowerCase();
        this.remitente = remitente;
        this.direccionRemitente = direccionRemitente.toLowerCase();
        this.envioASucursal = false;
        this.peso = peso;
        this.tracking=contador++;
    }

    public Item(String destinatario, String direccionDestinatario, String remitente, String direccionRemitente, boolean envioASucursal, int peso, int tracking) {
        this.destinatario = destinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.remitente = remitente;
        this.direccionRemitente = direccionRemitente;
        this.envioASucursal = envioASucursal;
        this.peso = peso;
        this.tracking = tracking;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public boolean isEnvioASucursal() {
        return envioASucursal;
    }

    public void setEnvioASucursal(boolean envioASucursal) {
        this.envioASucursal = envioASucursal;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTracking() {
        return tracking;
    }

    protected void setTracking(int tracking) {
        this.tracking = tracking;
    }

    @Override
    public boolean equals(Object obj) {
        try{
            Item envio=(Item) obj;
            if (envio.getDestinatario().equalsIgnoreCase(this.getDestinatario())&&envio.getRemitente().equalsIgnoreCase(this.getRemitente())){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
