package ej1.filtros;

import ej1.Socio;

public class FiltroPrecio extends Filtro{
    private int precio;
    public FiltroPrecio(int precio){
        this.precio=precio;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.pago(precio);
    }
}
