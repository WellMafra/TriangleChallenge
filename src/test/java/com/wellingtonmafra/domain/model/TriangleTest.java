package com.wellingtonmafra.domain.model;

import org.junit.Assert;
import org.junit.Test;

import com.wellingtonmafra.exception.InvalidLengthException;

public class TriangleTest {
    
    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(Length.of(10d), Length.of(10d), Length.of(10d));
        Assert.assertEquals(TriangleType.EQUILATERAL, triangle.getType());
        
        Triangle triangle2 = new Triangle(Length.of(9.9), Length.of(9.9), Length.of(9.9));
        Assert.assertEquals(TriangleType.EQUILATERAL, triangle2.getType());
        
        Triangle triangle3 = new Triangle(Length.of(5.7654), Length.of(5.7654), Length.of(5.7654));   
        Assert.assertEquals(TriangleType.EQUILATERAL, triangle3.getType());
    }
    
    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(Length.of(10d), Length.of(8d), Length.of(9d));
        Assert.assertEquals(TriangleType.SCALENE, triangle.getType());
        
        Triangle triangle2 = new Triangle(Length.of(9.8), Length.of(9.9), Length.of(9.99));
        Assert.assertEquals(TriangleType.SCALENE, triangle2.getType());
        
        Triangle triangle3 = new Triangle(Length.of(5.098098098), Length.of(5.0980123113), Length.of(5.9876543));
        Assert.assertEquals(TriangleType.SCALENE, triangle3.getType());
    }
    
    @Test
    public void testIsosceleTriangle() {
        Triangle triangle = new Triangle(Length.of(10d), Length.of(10d), Length.of(9d));
        Assert.assertEquals(TriangleType.ISOSCELES, triangle.getType());
        
        Triangle triangle2 = new Triangle(Length.of(9.8), Length.of(9.9), Length.of(9.8));
        Assert.assertEquals(TriangleType.ISOSCELES, triangle2.getType());
        
        Triangle triangle3 = new Triangle(Length.of(5.098098098), Length.of(5.7654), Length.of(5.7654));
        Assert.assertEquals(TriangleType.ISOSCELES, triangle3.getType());
    }
    
    @Test(expected=InvalidLengthException.class)
    public void testNegativeLength() {
        new Triangle(Length.of(-1d), Length.of(-1.1d), Length.of(-1.34242d));
    }
    
    @Test(expected=InvalidLengthException.class)
    public void testZeroLength() {
        new Triangle(Length.of(0d), Length.of(0.0d), Length.of(0.0000d));
    }
    
    @Test(expected=InvalidLengthException.class)
    public void testNullLength() {
        new Triangle(null, Length.of(0.0d), Length.of(0.0000d));
    }

}
