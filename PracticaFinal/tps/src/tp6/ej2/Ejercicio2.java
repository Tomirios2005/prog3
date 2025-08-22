package tp6.ej2;

public class Ejercicio2 {
//    Problema de la mochila: Se tienen n objetos y una mochila. Para i = 1,2,..n, el objeto i tiene un peso
//    positivo pi y un valor positivo vi. La mochila puede llevar un peso que no sobrepase P. El objetivo es
//    llenar la mochila de tal manera que se maximice el valor de los objetos transportados, respetando la
//    limitación de capacidad impuesta. Los objetos pueden ser fraccionados, si una fracción xi (0 ≤ xi ≤ 1)
//    del objeto i es ubicada en la mochila contribuye en xipi al peso total de la mochila y en xivi al valor
//    de la carga.
//¿Qué estrategia Greedy seguiría para resolver el problema? Esquematice la resolución mediante un
//    pseudocódigo en Java.
//
    //cada objeto tiene peso y valor, puede fraccionarse el objeto, y asi lo haran su peso y valor, para que asi entran en la mochi
    //el candidato se elige o por mayor valor, menor peso, o mayor valor por unidad de peso valor/peso
    private Item[]objetos;
    private double[]mochilaFraccion;
    private int pesoMaximo;

    public Ejercicio2(Item[] objetos, double[] mochilaFraccion, int pesoMaximo) {
        this.objetos = objetos;
        this.mochilaFraccion = mochilaFraccion;
        this.pesoMaximo = pesoMaximo;
    }
    public void greedyMochila(){
        double pesoActual=0;
        ordenarObjetos(objetos);//ordena objetos segun su valor por unidad de peso (valor/peso)
            for(int i=0;i<objetos.length;i++) {
                double pesoRestante=pesoMaximo-pesoActual;

                if (pesoActual>=pesoMaximo){
                    break;
                }



                Item candidato = objetos[i];
                if ((pesoActual + candidato.getPeso()) <= pesoMaximo) {
                    mochilaFraccion[i]=1;
                    pesoActual+=candidato.getPeso();
                }else  {
                    double fraccion= pesoRestante/candidato.getPeso();
                    mochilaFraccion[i]=fraccion;
                    pesoActual+=pesoRestante;


                }
            }
            mostrarValores(mochilaFraccion);


    }
}
