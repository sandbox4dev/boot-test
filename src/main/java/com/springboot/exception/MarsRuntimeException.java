package com.springboot.exception;

public class MarsRuntimeException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private Object[] params;

    public MarsRuntimeException(){
        super();
    }

    public MarsRuntimeException(Throwable cause){
        super(cause);
    }

    public MarsRuntimeException(Object... parameters){
        params = parameters;
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }

}
