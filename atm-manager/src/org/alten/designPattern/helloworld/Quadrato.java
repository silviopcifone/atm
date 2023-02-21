package org.alten.designPattern.helloworld;

public class Quadrato extends FiguraGeometrica{

    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcola() {
        return lato * lato;
    }
}
