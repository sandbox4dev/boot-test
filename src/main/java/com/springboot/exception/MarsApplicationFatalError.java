package com.springboot.exception;

public abstract class MarsApplicationFatalError extends  Error{
    private static final long serialVersionUID=1L;
    MarsApplicationFatalError(Throwable cause){
        super(cause);
    }
}
