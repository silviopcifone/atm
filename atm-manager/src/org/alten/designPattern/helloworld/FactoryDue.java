package org.alten.designPattern.helloworld;

import java.util.ArrayList;
import java.util.List;

public class FactoryDue {

    private static NotificaImpl notifica = new NotificaImpl();

    public static List<CalcolaArea> createComponents(String s) {


        String[] split = s.split(";");
        List<CalcolaArea> lista = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {

            CalcolaArea elemento = createComponent(split[i]);
            lista.add(elemento);

        }

        return lista;

    }

    private static CalcolaArea createComponent(String s) {

        //ad esempio s = q = 10; oppure t=(3,2)
        FiguraGeometrica figura = null;

        String[] valori = s.split("=");


        if (valori[0].equals("q")) {

            figura = createQuadrato(valori[1]);


        } else if (valori[0].equals("t")) {

            figura = createTriangolo(valori[1]);

        } else if (valori[0].equals("c")) {
            figura = crateCerchio(valori[1]);
        }
        figura.addObserved(notifica);
        return figura;
    }

    private static FiguraGeometrica createQuadrato(String s) {
        double lato = Double.parseDouble(s);
        return new Quadrato(lato);
    }

    private static FiguraGeometrica createTriangolo(String s) {
        String[] lati = s.split(",");
        double base = Double.parseDouble(lati[0]);
        double altezza = Double.parseDouble(lati[1]);
        return new Triangolo(base, altezza);
    }

    private static FiguraGeometrica crateCerchio(String s) {
        double raggio = Double.parseDouble(s);
        return new Cerchio(raggio);
    }
}



