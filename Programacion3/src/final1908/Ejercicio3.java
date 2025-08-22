package ProgramacionIII.final1908;

import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio3 {
    private int mejorAfinidad;
    private ArrayList<ArrayList<Invitado>>mejorSolucion;

    public Ejercicio3(){
    this.mejorSolucion=new ArrayList<Invitado>();
    mejorAfinidad=-1;
    }

//    public Asignacion asignarMesas(List<Invitado>invitados, int m, int k) {
//        ArrayList<ArrayList<Invitado>> mesas = new ArrayList<>();
//        ArrayList<Invitado>actual=new ArrayList<Invitado>();
//        HashSet<Invitado>asignados=new HashSet<Invitado>();
//
//
//        for (Invitado in:invitados) {
//            if (!asignados.contains(in)) {
//                backtrack(in, invitados, m, k, actual, asignados, mesas);
//            }
//        }
//        if (!actual.isEmpty()&&mesas.size()<m){
//            mesas.add(new ArrayList<Invitado>(actual));
//        }
//
//
//
//        return new Asignacion(mesas);
//    }

//    public void backtrack(Invitado in, List<Invitado> invitados,int m, int k, ArrayList<Invitado> actual,HashSet<Invitado> asignados,  ArrayList<ArrayList<Invitado>> mesas) {
//
//        actual.add(in);
//        asignados.add(in);
//
//        int afinidadActual = calcularAfinidad(actual);
//
//        // poda: si ya llegué al tamaño y no mejora
//        if (actual.size() == k && afinidadActual < this.mejorAfinidad) {
//            asignados.remove(in);
//            actual.remove(actual.size() - 1);
//            return;
//        }
//
//        // si mejora, lo actualizo
//        if (afinidadActual >= this.mejorAfinidad) {
//            this.mejorAfinidad = afinidadActual;
//
//            // si llegué a una mesa completa
//            if (actual.size() == k || asignados.size() == invitados.size()) {
//                if (mesas.size()<m){
//                    mesas.add(new ArrayList<Invitado>(actual));
//                    actual.clear();
//                    this.mejorAfinidad=-1; //actualizo para la siguiente mesa
//                    return;
//                }
//
//            } else {
//                for (Invitado inv : invitados) {
//                    if (!asignados.contains(inv)) {
//                        backtrack(inv, invitados, m, k, actual, asignados, mesas);
//                    }
//                }
//            }
//        }
//
//        // backtracking: deshago
//        asignados.remove(in);
//        actual.remove(actual.size() - 1);
//    }

    public Asignacion asignarMesas(ArrayList<Invitado>invitados, int m, int k) {
        ArrayList<ArrayList<Invitado>> mesas = new ArrayList<>();
        ArrayList<Invitado>actual=new ArrayList<Invitado>();
        for(ArrayList<Invitado>mesa:mesas){
            mesa=new ArrayList<Invitado>();
        }
        backtrack(mesas, invitados, k,0 );







        return new Asignacion(mejorSolucion);
    }
    public void backtrack(ArrayList<ArrayList<Invitado>>mesas, ArrayList<Invitado> invitados, int k, int indx){
        if (indx==invitados.size()){//posible solucion
            if(esMejorAfinidad(mesas)){//es la mejor?
                mejorSolucion.clear();
                mejorSolucion.addAll(mesas);
                mejorAfinidad=calcularAfinidad(mesas);
            }
            return; //si no es la mejor vuelve (innecesario igual)
        }else{
            Invitado inActual= invitados.get(indx);
            for (ArrayList<Invitado>mesa:mesas){
                mesa.add(inActual);
                asignados.add(inActual);
                if (mesa.size()<=k) {//poda si la mesa está llena
                    backtrack(mesas, invitados, k, indx+1);

                }
                asignados.remove(inActual);
                mesa.remove(mesa.size()-1);





            }
        }



    }
    public boolean esMejorAfinidad(ArrayList<ArrayList<Invitado>>mesas){
        int afinidad=0;
        for (ArrayList<Invitado>mesa:mesas){
            afinidad+=calcularAfinidad(mesa);
        }
        return afinidad>mejorAfinidad;
    }

}