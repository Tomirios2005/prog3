package ProgramacionIII.practico1;

import java.util.LinkedList;

public class Main {
    public static MySimpleLinkedList<Integer> crearListaOrdenadaComun(MySimpleLinkedList<Integer> l1, MySimpleLinkedList<Integer> l2){
        MySimpleLinkedList<Integer>retorno=new MySimpleLinkedList<>();
        for(Integer nodo:l1){
            for (Integer n:l2){
                if (nodo.equals(n)){
                    retorno.insertFront(n);
                    break;
                }
            }


        }
        return retorno;
    }

    public static void main(String[] args) {
        MySimpleLinkedList<Integer>l1=new MySimpleLinkedList<>();
        l1.insertFront(7);
        l1.insertFront(5);
        l1.insertFront(10);

        MySimpleLinkedList<Integer>l2=new MySimpleLinkedList<>();
        l2.insertFront(5);
        l2.insertFront(10);
        l2.insertFront(7);
        System.out.println(crearListaOrdenadaComun(l2,l1));


    }
}
