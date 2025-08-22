package tp6.ej1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    private List<Integer>denominaciones;

    public Ejercicio1(List<Integer> denominaciones) {
        this.denominaciones = denominaciones;
    }
//    public List<Integer> getMonedas(int total) {
//        List<Integer> monedas = new ArrayList<>();
//        int suma=0;
//        int indx=0;
//        ordenarMonedas(this.denominaciones);
//        while (suma<total&&indx<this.denominaciones.length){
//            if((suma+=denominaciones[indx])<=total){
//                monedas.add(this.denominaciones[indx]);
//            }else{
//                suma-=denominaciones[indx];
//                indx++;
//            }
//        }
//        return monedas;
//    }
    public List<Integer>getMonedas(int total){
        List<Integer> monedas = new ArrayList<>();
        int indx=0;
        while (!denominaciones.isEmpty()&&!solucion(monedas, total)){
            int candidato=denominaciones.get(indx);
            if (factible(candidato, monedas, total)){
                monedas.add(candidato);


            }else{
                indx++;
                if (indx>=denominaciones.size()){ //si te pasas es xq no encuentra
                    System.out.println("No hay solucion");
                    break;
                }
            }


        }
        return  monedas;

    }
    public boolean solucion(List<Integer> monedas, int total){
        int suma=0;
        for(Integer moneda: monedas){
            suma+=moneda;
        }
        return suma==total;
    }
    public boolean factible(int candidato,List<Integer> monedas, int cant) {
        ArrayList<Integer>copia=new ArrayList<>(monedas);
        copia.add(candidato);
        int suma=0;
        for (Integer moneda: copia){
            suma+=moneda;
        }
        return suma<=cant;
    }
    private void ordenarMonedas(int[] monedas) {
        int i, j, aux;

        for (i = 0; i <monedas.length-1; i++) {
            for (j=0; j < monedas.length-1; j++) {
                if (monedas[j] < monedas[j+1]) {
                    aux = monedas[j];
                    monedas[j] = monedas[j+1];
                    monedas[j+1] = aux;
                }
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> monedas = new ArrayList<>();
        monedas.add(100);
        monedas.add(25);
        monedas.add(10);
        monedas.add(5);
        monedas.add(2);
        Ejercicio1 calc=new Ejercicio1(monedas);
        System.out.println(calc.getMonedas(2));
    }
}
