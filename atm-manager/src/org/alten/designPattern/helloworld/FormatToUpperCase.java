package org.alten.designPattern.helloworld;

public class FormatToUpperCase implements Format{
    @Override
    public String format(String s) {
        return s.toUpperCase();
    }
}
