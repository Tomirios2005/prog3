import java.util.ArrayList;

public class Tienda {
    private ArrayList<Articulo>articulos;

    public Tienda() {
        articulos=new ArrayList<>();
    }
    public ArrayList<Articulo>buscarArticulo(Condicion cc){
        ArrayList<Articulo>retorno=new ArrayList<>();
        for(Articulo aa:articulos){
            if (cc.cumple(aa)){
                retorno.add(aa);
            }
        }
        return retorno;
    }
    public void addArticulo(Articulo aa){
        if (!articulos.contains(aa)){
            articulos.add(aa);
        }
    }
}
