package ej6.calculadores;

import ej6.Figurita;

public class CalculadorMultiplicador extends Calculador{
    private int multiplicador;
    public CalculadorMultiplicador(int multiplicador){
        this.multiplicador=multiplicador;
    }

    @Override
    public double calcular(Figurita ff, double precioBase) {
        double precio=ff.getPrecio()*multiplicador;
        if (precio>=precioBase){
            return precio;
        }
        else
            return precioBase;
    }
}
