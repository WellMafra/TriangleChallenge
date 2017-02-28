package com.wellingtonmafra.domain.model;

import org.junit.Assert;
import org.junit.Test;

import com.wellingtonmafra.domain.type.TriangleType;

public class TriangleTest {
    
    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = Triangle.of(10d, 10d, 10d);
        Assert.assertEquals(TriangleType.EQUILATERAL, triangle.getType());
        
        Triangle triangle2 = Triangle.of(9.9, 9.9, 9.9);
        Assert.assertEquals(TriangleType.EQUILATERAL, triangle2.getType());
        
        Triangle triangle3 = Triangle.of(5.7654, 5.7654, 5.7654);   
        Assert.assertEquals(TriangleType.EQUILATERAL, triangle3.getType());
    }
    
    @Test
    public void testScaleneTriangle() {
        Triangle triangle = Triangle.of(10d, 8d, 9d);
        Assert.assertEquals(TriangleType.SCALENE, triangle.getType());
        
        Triangle triangle2 = Triangle.of(9.8, 9.9, 9.99);
        Assert.assertEquals(TriangleType.SCALENE, triangle2.getType());
        
        Triangle triangle3 = Triangle.of(5.098098098, 5.0980123113, 5.9876543);
        Assert.assertEquals(TriangleType.SCALENE, triangle3.getType());
    }
    
    @Test
    public void testIsosceleTriangle() {
        Triangle triangle = Triangle.of(10d, 10d, 9d);
        Assert.assertEquals(TriangleType.ISOSCELES, triangle.getType());
        
        Triangle triangle2 = Triangle.of(9.8, 9.9, 9.8);
        Assert.assertEquals(TriangleType.ISOSCELES, triangle2.getType());
        
        Triangle triangle3 = Triangle.of(5.098098098, 5.7654, 5.7654);
        Assert.assertEquals(TriangleType.ISOSCELES, triangle3.getType());
    }
}
