package tp4;

import ProgramacionIII.tp4.CaminoMasLargo;
import ProgramacionIII.tp4.GrafoDirigido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creo un grafo dirigdo donde las etiquetas de los arcos son valores Float
        GrafoDirigido<Integer> grafito = new GrafoDirigido<>();

        // Agrego los vertices 1 y 2
        grafito.agregarVertice(1);
        grafito.agregarVertice(2);
        grafito.agregarVertice(3);
        grafito.agregarVertice(4);


        // Genero un arco desde 1 hasta 2 con el valor de etiqueta 3
        grafito.agregarArco(1,3,0);
        grafito.agregarArco(2,3,0);


        grafito.agregarArco(1, 2, 3);
        grafito.agregarArco(2, 4, 3);
        grafito.agregarArco(4, 3, 3);

        grafito.agregarArco(2, 1, 3);





        // Obtengo el arco entre 1 y 2, y le pido la etiqueta
//        Float etiqueta = grafito.obtenerArco(1, 2).getEtiqueta();

//        System.out.println(etiqueta); // Debería imprimir 3
//        ServicioDFS<Float> dfs=new ServicioDFS<>(grafito);
//        dfs.dfs();
        CaminoMasLargo<Integer> buscador = new CaminoMasLargo<>(1, 3, grafito);
        ArrayList<Integer> camino = buscador.getCamino();
        System.out.println("Camino más largo: " + camino);


    }
}
