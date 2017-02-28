package com.wellingtonmafra.domain.model;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    
    @Test
    public void testIsPerfect() {
        Square square = Square.of(10d, 10d, 10d, 10d);
        Assert.assertTrue(square.isPerfect());
        
        Square square2 = Square.of(9.9, 9.9, 9.9, 9.9);
        Assert.assertTrue(square2.isPerfect());
        
        Square square3 = Square.of(5.7654, 5.7654, 5.7654, 5.7654);   
        Assert.assertTrue(square3.isPerfect());
    }
    
    @Test
    public void testIsNotPerfect() {
        Square square = Square.of(10d, 10d, 9d, 10d);
        Assert.assertFalse(square.isPerfect());
                
        Square square3 = Square.of(5.098098098, 5.7654, 5.7654, 5.098098098);   
        Assert.assertFalse(square3.isPerfect());
    }
}
