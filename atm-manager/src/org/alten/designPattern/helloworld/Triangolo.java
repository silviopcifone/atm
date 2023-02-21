package org.alten.designPattern.helloworld;

public class Triangolo extends FiguraGeometrica{
    public double base;
    public double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;


    } @Override
    public double calcola(){
        return (base * altezza)/2;

    }

}