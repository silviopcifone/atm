package org.alten.designPattern.helloworld;

import java.util.List;

public class ServiceLocator {
    static Servizio servizio = new ServizioBean();
    static Servizio proxy = new ServizioProxy(servizio);

    public static Servizio createServizio() {
        return proxy;
    }
}
