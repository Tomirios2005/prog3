public class Conversor {
    private static final double pulgada = 2.54; // centimetros
    private static final double libra = 0.453592; // kilos
    private static final double galon = 3.78541; // litros

    public static double convertirAPulgada(double centimetros) {
        return centimetros / pulgada;
    }

    public static double convertirACentimetro(double pulgada) {
        return pulgada * pulgada;
    }

    public static double convertirAKilogramos(double libras) {
        return libras * libra;
    }

    public static double convertirALibras(double kilogramos) {
        return kilogramos / libra;
    }

    public static double convertirALitros(double galones) {
        return galones * galon;
    }

    public static double convertirAGalones(double litros) {
        return litros / galon;
    }
}
