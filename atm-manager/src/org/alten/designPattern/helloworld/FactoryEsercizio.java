package org.alten.designPattern.helloworld;

public class FactoryEsercizio {

    static EsercizioUno esempio = new EsercizioUnoComposite();
    static EsercizioUno esempio2 = new EsercizioDueAdapter();


    public static EsercizioUno createEsercizioUno() {

      //  System.out.println("Stringa da Factory = " + System.getenv("MODE"));
        if (("1").equals(System.getenv("MODE"))) {
            return esempio;
        } else {
            return esempio2;
        }
    }
}