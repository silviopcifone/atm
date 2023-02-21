package org.alten.designPattern.helloworld;

public class EsercizioDueAdapter implements EsercizioUno{

   private EsercizioDue esempio2 = new EsercizioDueImpl();

    @Override
    public void stampa(String s) {
        esempio2.saluti(s.length());
    }
}
