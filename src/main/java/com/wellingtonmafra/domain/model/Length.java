package com.wellingtonmafra.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.wellingtonmafra.exception.InvalidLengthException;

public class Length implements Serializable {
    
    private static final long serialVersionUID = -6528324358661578620L;
    
    private final BigDecimal value;
    
    private Length(BigDecimal value) {
        this.value = value;
    }
    
    public static Length of(double value) {
        if (value <= 0d)
            throw new InvalidLengthException();
        return new Length(BigDecimal.valueOf(value));
    }
        
    public int compareTo(Length comparable) {
        return this.value.compareTo(comparable.value);
    }
}