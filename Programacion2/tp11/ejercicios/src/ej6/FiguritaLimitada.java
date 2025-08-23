package ej6;

import ej6.calculadores.Calculador;

public class FiguritaLimitada extends Figurita{
    private Calculador calcPrecio;
    private int cantUnidades;

    public FiguritaLimitada(String nombre, String album, double precio, int numero, Calculador calcPrecio, int cantUnidades) {
        super(nombre, album, precio, numero);
        this.calcPrecio = calcPrecio;
        this.cantUnidades=cantUnidades;

    }

    public int getCantUnidades() {
        return cantUnidades;
    }

    public void setCantUnidades(int cantUnidades) {
        this.cantUnidades = cantUnidades;
    }

    public Calculador getCalcPrecio() {
        return calcPrecio;
    }

    public void setCalcPrecio(Calculador calcPrecio) {
        this.calcPrecio = calcPrecio;
    }

    @Override
    public double getPrecio() {
        return calcPrecio.calcular(this, super.getPrecio());
    }
}
