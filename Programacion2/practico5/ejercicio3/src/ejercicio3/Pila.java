package ejercicio3;
import java.util.ArrayList;
public class Pila {
    private ArrayList<Object> elementos;
    public Pila(){
        elementos=new ArrayList<>();
    }
    public void push(Object o){
        elementos.add(o);

    }
    public Object pop(){
        Object elementoAborrar=elementos.get(elementos.size());
        elementos.remove(elementos.size());
        return elementoAborrar;
    }
    public Object top(){
        Object tope=elementos.get(elementos.size());
        return tope;
    }
    public int size(){
        return elementos.size();
    }
    public ArrayList<Object> copy(){
        ArrayList<Object> copia = new ArrayList<>();
        copia.addAll(elementos);
        return copia;

    }
    public ArrayList<Object>reverse(){
        ArrayList<Object> invertido=new ArrayList<>();
        int j=0;
        for (int i = (elementos.size()-1); i >= 0; i--) {
            invertido.add(i, elementos.get(j));
            j++;
            
        }
        
        return invertido;
    }


}

