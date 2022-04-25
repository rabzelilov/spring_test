package com.rabzelilov.spring_test.rest.Exceptions;

public class StrainsNotFoundException extends RuntimeException{
    public StrainsNotFoundException() {
        super ("Strain not found" );
    }
}
