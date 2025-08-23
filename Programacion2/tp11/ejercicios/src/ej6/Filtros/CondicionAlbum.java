package ej6.Filtros;

import ej6.Figurita;

public class CondicionAlbum extends Condicion{
    private String album;
    public CondicionAlbum(String album){
        this.album=album;
    }
    @Override
    public boolean cumple(Figurita cc) {
        return cc.esDelAlbum(album);
    }
}
