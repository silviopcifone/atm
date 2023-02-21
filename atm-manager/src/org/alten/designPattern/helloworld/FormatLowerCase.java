package org.alten.designPattern.helloworld;

public class FormatLowerCase implements Format{
    @Override
    public String format(String s) {
        return s.toLowerCase();
    }
}
