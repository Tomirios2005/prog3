public class main {
    public static void main(String[] args) {
        Electrodomestico a1 = new Electrodomestico("pava", 2022, "ford",23);
        a1.setNombre("televisor");
        Condicion c1 = new CondicionNombre("televisor");
        Tienda t1=new Tienda();
        t1.addArticulo(a1);
        t1.buscarArticulo(c1);
        System.out.println(t1.buscarArticulo(c1));


    }
}
