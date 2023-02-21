package org.alten.designPattern.helloworld;

public class FormatSymbol implements Format{

    @Override
    public String format(String s) {
        return s.replaceAll(";","#");
    }
}
