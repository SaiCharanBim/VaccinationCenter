package com.example.covidBackend.exceptions;

public class WrongCredentials extends RuntimeException{
    public WrongCredentials(String msg){
        super(msg);
    }
}
