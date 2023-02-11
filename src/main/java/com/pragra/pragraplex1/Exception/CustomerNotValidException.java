package com.pragra.pragraplex1.Exception;

public class CustomerNotValidException extends RuntimeException {
    public CustomerNotValidException(String format)
    {
        super(format);
    }
}
