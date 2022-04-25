package com.rabzelilov.spring_test.rest.controllers.advice;

import com.rabzelilov.spring_test.rest.Exceptions.StrainsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class StrainsNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(StrainsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String strainNameNotFoundHandler(StrainsNotFoundException ex) {
        return ex.getMessage();
    }
}
