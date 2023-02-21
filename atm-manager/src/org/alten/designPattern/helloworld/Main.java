package org.alten.designPattern.helloworld;

public class Main {

    public static void main(String[] args) {

        EsercizioUno uno = FactoryEsercizio.createEsercizioUno();
        String s = "Hello World";
        uno.stampa(args[0]);
        System.out.println(System.getenv("MODE"));



    }
}