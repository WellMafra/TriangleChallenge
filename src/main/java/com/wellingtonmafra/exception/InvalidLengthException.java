package com.wellingtonmafra.exception;

public class InvalidLengthException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;
    
    public InvalidLengthException() {
        super("The length should be gratter than 0.");
    }

}
