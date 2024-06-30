package com.springcore.global_exception.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public String handleRunTimeException() {
        return "Runtime Exception is Handled";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException() {
        return "IllegalArgumentException is Handled";
    }

    @ExceptionHandler(NullPointerException.class)
    public String handlerNullPointerException() {
        return "NullPointerException is Handled";
    }
}
