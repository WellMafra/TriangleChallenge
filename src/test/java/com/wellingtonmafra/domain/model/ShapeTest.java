package com.wellingtonmafra.domain.model;

import org.junit.Assert;
import org.junit.Test;

import com.wellingtonmafra.exception.InvalidShapeException;

public class ShapeTest {
    
    public void testShapeOK() {
        Shape.of(2d, 3d, 4d, 5d);
        Assert.assertTrue(true);
    }
    
    @Test(expected=InvalidShapeException.class)
    public void testNullSides() {
        Shape.of(null);
    }
    
    @Test(expected=InvalidShapeException.class)
    public void testZeroSides() {
        Shape.of(new double[] {});
    }

}
