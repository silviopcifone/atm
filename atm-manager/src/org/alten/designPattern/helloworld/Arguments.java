package org.alten.designPattern.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arguments {

    List<String> arguments;

    private Format formatta=new FormatNone();


    public Arguments(String[] arguments) {
        this.arguments = new ArrayList<>(Arrays.asList(arguments));
    }

    public String getCommand() {
        return formatta.format( this.arguments.get(0));
    }
    public void setFormat(Format format){
        this.formatta=format;
    }
}
