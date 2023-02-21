package org.alten.designPattern.helloworld;

public class EsercizioUnoComposite implements EsercizioUno, EsercizioDue {

    EsercizioUnoImpl e = new EsercizioUnoImpl();
    EsercizioUnoImplV1 f = new EsercizioUnoImplV1();
    EsercizioDueImpl g = new EsercizioDueImpl();


    @Override
    public void stampa(String s) {
        e.stampa(s);
        f.stampa(s);
    }

    @Override
    public void saluti(int i) {
        g.saluti(i);

    }
}
