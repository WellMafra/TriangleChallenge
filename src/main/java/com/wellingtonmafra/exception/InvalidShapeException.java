package com.wellingtonmafra.exception;

public class InvalidShapeException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;
    
    public InvalidShapeException() {
        super("The shape should be contains 1 size at least.");
    }

}
