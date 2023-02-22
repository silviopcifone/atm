package org.eih.atm.exception;

public class AtmOperationException extends RuntimeException{
    private String message;

    public AtmOperationException(String message){
        super();
        this.message = message;
    }
}
