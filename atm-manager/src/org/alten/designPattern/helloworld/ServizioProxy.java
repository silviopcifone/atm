package org.alten.designPattern.helloworld;

import java.util.List;

public class ServizioProxy implements Servizio{

    Servizio servizioBean;

    public ServizioProxy(Servizio servizioBean) {
        this.servizioBean = servizioBean;
    }

    @Override
    public List<String> getcodiceIstat() {
        return this.servizioBean.getcodiceIstat();
    }
}
