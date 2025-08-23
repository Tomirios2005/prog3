public class Electrodomestico{
    String nombre, color;
    int precioBase, consumo, peso;

    public Electrodomestico(String nombre, String color, int precioBase, int consumo, int peso){
        this.nombre=nombre;
        this.color=color;
        this.precioBase=precioBase;
        this.consumo=consumo;
        this.peso=peso;
    }
    public Electrodomestico(String nombre){
        this(nombre, "gris plata", 100, 10, 2);
    }
    
    public Electrodomestico(String nombre, int precioBase) {
    
        this(nombre, "gris plata", precioBase, 10, 2);

    }
    
    public Electrodomestico(String nombre, String color, int precioBase) {
        this(nombre, color, precioBase, 10, 2);

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public int getConsumo() {
        return consumo;
    }
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public boolean esBajoConsumo(){
        return getConsumo()<45;
    }
    public int balance(){
        int costo=getPrecioBase();
        int peso= getPeso();
        return costo/peso;
    }
    public boolean esAltaGama(){
        return this.balance()>3;
    }

}