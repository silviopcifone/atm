package org.alten.designPattern.helloworld;

public class EsercizioUnoImpl implements  EsercizioUno{


    @Override
    public void stampa(String s) {
        System.out.println(s);
    }

    public String version() {

        return "1.0";
    }

}
