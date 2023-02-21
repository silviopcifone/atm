package org.alten.designPattern.helloworld;

public class Main3 {
    public static void main(String[] args) {
        Arguments arguments= new Arguments(args);
        System.out.println(arguments.getCommand());
        arguments.setFormat(new FormatToUpperCase());
        System.out.println(arguments.getCommand());
        arguments.setFormat(new FormatSymbol());
        System.out.println(arguments.getCommand());
    }
}
