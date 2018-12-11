package com.springboot.exception;

public class MarsNullPointerException extends NullPointerException{
    private static final long serialVersionUID =1L;
    private Object [] params;

    public MarsNullPointerException(Object...parameters){
        params = parameters;
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
