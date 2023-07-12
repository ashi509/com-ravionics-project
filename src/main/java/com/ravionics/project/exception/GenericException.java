package com.ravionics.project.exception;

import lombok.Data;

@Data
public class GenericException extends Throwable {
    private int statusCode;
    private String errorMessage;
    public GenericException(int statusCode,String errorMessage){
        super(errorMessage);
        this.errorMessage=errorMessage;
        this.statusCode=statusCode;
    }
}

