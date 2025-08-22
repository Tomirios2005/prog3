package ProgramacionIII.practico1;

import java.util.Iterator;

public class MySimpleLinkedList<T>implements Iterable<T> {

    private Node<T> first;
    private int size;

    public MySimpleLinkedList() {
        this.first = null;
        size=0;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
        this.size++;
    }

    public T extractFront() {
        if (this.first!=null){
            Node<T>tmp=this.first;
            this.first=tmp.getNext();
            if (size>0){
                size--;
            }

            return this.first.getInfo();

        }else {
            return null;
        }

    }

    public boolean isEmpty() {
        return this.first==null;
    }

    public T get(int index) {
        Node<T>retorno=this.first;
        if (retorno!=null){
            for (int i=0; i<index; i++){
                retorno=retorno.getNext();

            }

        }

        return retorno.getInfo();
    }

    public int size() {
        return this.size;
    }

    public int indexOf(T elem){
        if (this.first==null){
            return -1;
        }
        Node<T>puntero = this.first;
        int contador = 0;
        while (!puntero.getInfo().equals(elem)&&contador<=size){
            puntero=puntero.getNext();
            contador++;
        }
        if (contador<=size){
            return contador;
        }

        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(this.first);
    }

    @Override
    public String toString() {
        StringBuilder retorno= new StringBuilder();
        Node<T>tmp=this.first;
        while (tmp!=null){
            retorno.append(tmp.getInfo()).append(", ");
            tmp =tmp.getNext();
        }
        return retorno.toString();
    }

}