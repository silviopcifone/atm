package org.alten.designPattern.helloworld;

import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        Arguments arguments=new Arguments(args);
        List<CalcolaArea> lista = FactoryDue.createComponents(arguments.getCommand());

        for (int i = 0; i < lista.size(); i++) {

            double aree = lista.get(i).calcola();
            System.out.println(aree);
        }
        System.out.println(lista);

    }

}
