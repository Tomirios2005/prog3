package tp5.ej2;

import java.util.ArrayList;

public class Ejercicio2 {
//    Dado un laberinto consistente en una matriz cuadrada que tiene en cada posición un valor natural y
//    cuatro valores booleanos, indicando estos últimos si desde esa casilla se puede ir al norte, este, sur
//    y oeste, encontrar un camino de longitud mínima entre dos casillas dadas, siendo la longitud de un
//    camino la suma de los valores naturales de las casillas por las que pasa. Idea: podría representarse
//    el laberinto como una matriz, de objetos, donde cada objeto tiene el valor natural, y cuatro
//    booleanos, uno para cada dirección a la que se permite ir desde allí.

    private Casillero[][]laberinto;
    Casillero inicio, fin;
    ArrayList<Casillero>solucion;

    public Ejercicio2(Casillero[][] laberinto, Casillero inicio, Casillero fin) {
        this.laberinto = laberinto;
        this.inicio = inicio;
        this.fin = fin;
        solucion = new ArrayList<>();
    }
    public void encontrarCamino() {
        ArrayList<Casillero> valores=new ArrayList();
        int jInicio=-1,iInicio=-1;
        for (int i=0; i<= laberinto.length-1; i++){
            for (int j=0; j<= laberinto[i].length-1; j++){
                if (laberinto[i][j]==inicio){
                    jInicio=j;
                    iInicio=i;
                    break;
                }

            }
            if (iInicio==i){
                break;
            }
        }
        valores.add(inicio);

        backtrack(inicio,iInicio, jInicio, valores);
    }
    private void backtrack(Casillero actual, int i, int j, ArrayList<Casillero> solucionActual) {
        if (actual.equals(fin)){
            if (getLongitud(solucionActual)<getLongitud(solucion)||solucion.isEmpty()){
                solucion.clear();
                solucion.addAll(solucionActual);

            }
        }else{
            if (actual.isEste()){
                if (laberinto[i][j+1]!=null&&!solucionActual.contains(laberinto[i][j+1])){
                    solucionActual.add(laberinto[i][j+1]);
                    backtrack(laberinto[i][j+1],i,j+1,solucionActual);
                    solucionActual.remove(solucionActual.size()-1);

                }
            }
            if (actual.isNorte()){
                if (laberinto[i-1][j]!=null&&!solucionActual.contains(laberinto[i-1][j])){
                    solucionActual.add(laberinto[i-1][j]);
                    backtrack(laberinto[i-1][j],i-1,j,solucionActual);
                    solucionActual.remove(solucionActual.size()-1);
                }
            }
            if (actual.isSur()) {
                if (i + 1 < laberinto.length && laberinto[i + 1][j] != null && !solucionActual.contains(laberinto[i + 1][j])) {
                    solucionActual.add(laberinto[i + 1][j]);
                    backtrack(laberinto[i + 1][j], i + 1, j, solucionActual);
                    solucionActual.remove(solucionActual.size() - 1);
                }
            }
            if (actual.isOeste()) {
                if (j - 1 >= 0 && laberinto[i][j - 1] != null && !solucionActual.contains(laberinto[i][j - 1])) {
                    solucionActual.add(laberinto[i][j - 1]);
                    backtrack(laberinto[i][j - 1], i, j - 1, solucionActual);
                    solucionActual.remove(solucionActual.size() - 1);
                }
            }


        }
    }
    private int getLongitud(ArrayList<Casillero> casilleros) {
        int suma=0;
        for (Casillero c:casilleros){
            suma+=c.getValor();
        }
        return suma;
    }
}
