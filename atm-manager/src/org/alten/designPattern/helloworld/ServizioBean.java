package org.alten.designPattern.helloworld;

import java.util.ArrayList;
import java.util.List;

public class ServizioBean implements Servizio {
    @Override
    public List<String> getcodiceIstat() {
        List<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}
