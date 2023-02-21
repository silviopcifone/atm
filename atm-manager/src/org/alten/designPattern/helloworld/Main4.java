package org.alten.designPattern.helloworld;

public class Main4 {
    public static void main(String[] args) {
        Servizio servizio = ServiceLocator.createServizio();
        System.out.println(servizio.getcodiceIstat().toString());

        System.out.println(servizio.getcodiceIstat().toString());
    }
}
