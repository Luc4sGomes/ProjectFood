package com.menu.code;

public class Pastel extends Salgados {

    private int[] quant = new int [100];

    private String kind;

    private double valor = 2.50;


    public int[] getQuant() {
        return quant;
    }

    public void setQuant(int[] quant) {
        this.quant = quant;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
