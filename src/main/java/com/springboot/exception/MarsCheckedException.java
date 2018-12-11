package com.springboot.exception;

public class MarsCheckedException extends Exception{
    private static final long serialVersionUID=1L;
    private Object[] params;

    public MarsCheckedException(Object... parameters){
        params = parameters;
    }

    public MarsCheckedException(Throwable cause,Object... parameters){
        super(cause);
        params=parameters;
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
