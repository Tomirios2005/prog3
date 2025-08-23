public class Planta {
    private String nombreCientifico;
    private String nombreComun;
    private String paisOrigen;
    private String fechadeCompra;
    private static int contadorId=0;
    private int id;
    public Planta(String nombreCientifico, String nombreComun, String paisOrigen, String fechadeCompra) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.paisOrigen = paisOrigen;
        this.fechadeCompra = fechadeCompra;
        this.id=++contadorId;
        

    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public String getNombreComun() {
        return nombreComun;
    }
    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public String getFechadeCompra() {
        return fechadeCompra;
    }
    public void setFechadeCompra(String fechadeCompra) {
        this.fechadeCompra = fechadeCompra;
    }
    public static int getContadorId() {
        return contadorId;
    }
    public static void setContadorId(int contadorId) {
        Planta.contadorId = contadorId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        return "Planta [nombreCientifico=" + nombreCientifico + ", nombreComun=" + nombreComun + ", paisOrigen="
                + paisOrigen + ", fechadeCompra=" + fechadeCompra + ", id=" + id + "]";
    }

    

    
}
