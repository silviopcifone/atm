package org.alten.designPattern.helloworld;

import java.util.ArrayList;
import java.util.List;

public abstract class FiguraGeometrica implements CalcolaArea {

     private List<Notifica> listaNotifiche= new ArrayList<>();
    public void notifica(String s){
        for (Notifica a: listaNotifiche) {
         a.notifica(s);
        }
    }
    public void addObserved(Notifica n){
        listaNotifiche.add(n);
    }
}
