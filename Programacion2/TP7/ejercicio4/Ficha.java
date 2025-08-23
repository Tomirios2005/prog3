package ejercicio4;

import java.util.Objects;

public class Ficha {
    private int fortaleza;
    private int tamanio;
    private int poderDestruccion;

    public Ficha(int fortaleza, int tamanio, int poderDestruccion) {
        this.fortaleza = fortaleza;
        this.tamanio = tamanio;
        this.poderDestruccion = poderDestruccion;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPoderDestruccion() {
        return poderDestruccion;
    }

    public void setPoderDestruccion(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    @Override
    public boolean equals(Object o) {
        try{
            Ficha f=(Ficha)o;
            if (f.getTamanio()==this.getTamanio()&&f.getFortaleza()==this.getPoderDestruccion()) {
                return true;
            }else{
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }
    public String toString(){
        return "fortaleza: "+this.getFortaleza()+"ocupa: "+this.getTamanio()+"destruccion: "+this.getPoderDestruccion();
    }


}
