package ej6.calculadores;

import ej6.Figurita;

public class CalculadorFijo extends Calculador{
    private double precio;
    public CalculadorFijo(double precio){
        this.precio=precio;
    }

    @Override
    public double calcular(Figurita ff, double precioBase) {
        if (precio>=precioBase){
            return precio;
        }else{
            return precioBase;
        }
    }
}
