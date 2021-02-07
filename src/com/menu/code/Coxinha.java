package com.menu.code;

public class Coxinha extends Salgados {

    private int[] quant = new int[100];

    private double valor = 2.50;

    public int[] getQuant() {
        return quant;
    }

    public void setQuant(int[] quant) {
        this.quant = quant;
    }


    public double getValue() {
        return valor;
    }

    public void setValue(double value) {
        this.valor = valor;
    }
}
