public class ejecutar {
    public static void main(String[] args) {
        String fecha="17/8/2000";
        Persona Tomas= new Persona(46568155);
        System.out.println(Tomas.calcMasaCorporal());
        System.out.println(Tomas.estaEnForma());
        System.out.println(Tomas.cumpleAnios(fecha));

    }
    
}
