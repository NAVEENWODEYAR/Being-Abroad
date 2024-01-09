package com.beingabroad.test.exception;

public class InstitutionNotFoundException extends RuntimeException{
    public InstitutionNotFoundException(String msg){
        super(msg);
    }
}
