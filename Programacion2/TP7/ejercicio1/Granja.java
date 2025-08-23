package ejercicio2;

import java.util.ArrayList;

public class Granja {

    private final ArrayList<ProductoQuimico> productosQuimicos;

    public Granja() {
        this.productosQuimicos = new ArrayList<ProductoQuimico>();
    }

    public void addProductoQuimico(ProductoQuimico pq) {
        if (!this.productosQuimicos.contains(pq)) {
            this.productosQuimicos.add(pq);
        }
    }

    public void removeProductoQuimico(ProductoQuimico pq) {
        this.productosQuimicos.remove(pq);
    }

    public ArrayList<ProductoQuimico> listar(Filtro filtro){
        ArrayList<ProductoQuimico> salida = new ArrayList<ProductoQuimico>();
        for (int i = 0; i < this.productosQuimicos.size(); i++) {
            ProductoQuimico pq = this.productosQuimicos.get(i);
            if(filtro.cumple(pq)){
                salida.add(pq);
            }
        }
        return salida;
    }
}
