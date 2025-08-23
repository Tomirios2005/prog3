package ejercicio4;

public class Juego {
    public static void main(String[] args) {
        Tablero s1= new Tablero(20);
        Ficha chocolate=new Ficha(1,1,0);
        Ficha piedra=new Ficha(6,1,0);
        Ficha caramelo=new Ficha(1,1,10);
        Ficha torta=new Ficha(4,8,4);
        Ficha chupetin=new FichaEspecial(5,3);
        FichaEspecial ff=new FichaEspecial(0, 0, 0);
        ff.getFortaleza();
        s1.addFichas(chocolate);
        s1.addFichas(piedra);
        s1.addFichas(caramelo);
        s1.addFichas(torta);
        s1.addFichas(chupetin);
        Condicion destruccion=new CondicionDestruccionMayor(2);
        Condicion lugares=new CondicionTamanioMayor(4);
        Condicion fortaleza=new CondicionFortalezaMayor(5);
        Condicion and=new CondicionAnd(destruccion,lugares);
        System.out.println("destruccion mayor a 2: "+s1.buscarFicha(destruccion));
        System.out.println("ocupa mas de 4 lugares: "+s1.buscarFicha(lugares));

        System.out.println("fortaleza mayor a 5: "+ s1.buscarFicha(fortaleza));

        System.out.println("destruccion mayor a 2 y tamanio mayor a 4: "+s1.buscarFicha(and));

    }
}
