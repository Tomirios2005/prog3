package ej3.filtros;

import ej3.Noticia;

public class CondicionTopico extends Condicion{
    private String palabra;

    public CondicionTopico(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia nn) {
        return nn.tienePalabraClave(palabra);
    }
}
