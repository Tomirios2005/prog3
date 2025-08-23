public class ejecutable {
    public static void main(String[] args) {
        Electrodomestico heladera= new Electrodomestico("heladera","gris",450000, 200, 70);
        System.out.println("es bajo consumo:"+heladera.esBajoConsumo());
        System.out.println("balance:"+heladera.balance());
        System.out.println("es alta gama:"+heladera.esAltaGama());

    }
    
}
