package com.wellingtonmafra.domain.model;

import org.junit.Assert;
import org.junit.Test;

import com.wellingtonmafra.exception.InvalidLengthException;

public class LengthTest {
    
    public void testLengthOK() {
        Length.of(2d);
        Assert.assertTrue(true);
    }
    
    @Test(expected=InvalidLengthException.class)
    public void testNegativeLength() {
        Length.of(-1d);
    }
    
    @Test(expected=InvalidLengthException.class)
    public void testZeroLength() {
        Length.of(0d);
    }

}
