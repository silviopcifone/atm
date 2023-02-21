package org.alten.designPattern.helloworld;

public class Cerchio extends FiguraGeometrica {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double calcola() {
        notifica("calcola cerchio");
        return Math.pow(raggio,2)*Math.PI;
    }
}
