package com.rabzelilov.spring_test.rest.Exceptions;

public class UsersNotFoundException extends RuntimeException{
    UsersNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
