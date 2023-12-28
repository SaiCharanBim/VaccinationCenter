package com.example.covidBackend.exceptions;

public class PatientDoesNotExistException extends RuntimeException{
    public PatientDoesNotExistException(String message){
        super(message);
    }
}
