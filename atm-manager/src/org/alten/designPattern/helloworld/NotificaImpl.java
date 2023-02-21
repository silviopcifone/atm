package org.alten.designPattern.helloworld;

public class NotificaImpl implements Notifica {

    @Override
    public void notifica(String s) {
        System.out.println("notifica: " + s);
    }
}
