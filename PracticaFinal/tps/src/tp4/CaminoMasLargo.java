package tp4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CaminoMasLargo<T> {
    private ArrayList<ArrayList<Integer>>caminos;
    private ArrayList<Integer>caminoActual=new ArrayList<>();
    private int vertice1, vertice2;
    private Grafo<T>grafo;
    private HashSet<Integer> visitado;
    public CaminoMasLargo(int vertice1, int vertice2, Grafo<T>grafo){
        this.vertice1=vertice1;
        this.vertice2=vertice2;
        caminos=new ArrayList<>();
        this.grafo=grafo;
        visitado=new HashSet<>();
    }
    public ArrayList<Integer> getCamino(){
        getCamino(vertice1);
        ArrayList<Integer>retorno=new ArrayList<>();
        for (ArrayList<Integer>camino:caminos){
            if (camino.size()> retorno.size()){
                retorno=camino;
            }
        }
        return retorno;


    }
    private void getCamino(Integer vertice){
        caminoActual.add(vertice);
        visitado.add(vertice);
        Iterator<Integer>adyacentes=grafo.obtenerAdyacentes(vertice);
        if (vertice.equals(vertice2)){
            caminos.add(new ArrayList<>(caminoActual));

        }else {
            while (adyacentes.hasNext()) {
                Integer ady = adyacentes.next();
                if (!visitado.contains(ady)) {
                    getCamino(ady);
                }
            }
        }

        caminoActual.removeLast();
        visitado.remove(vertice);



    }
}
