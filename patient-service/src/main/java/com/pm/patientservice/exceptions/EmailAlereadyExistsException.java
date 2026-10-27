package com.pm.patientservice.exceptions;

public class EmailAlereadyExistsException extends RuntimeException {

    public EmailAlereadyExistsException(String message) {
        super(message);
    }


}
