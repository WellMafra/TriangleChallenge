package com.wellingtonmafra.domain.model;

import java.io.Serializable;

import com.wellingtonmafra.domain.type.TriangleType;

public class Triangle implements Serializable {
        
    private static final long serialVersionUID = -2274232613174941766L;
    
    private Shape shape;

    private Triangle() {
    }
    
    private Triangle(double side1, double side2, double side3) {
        shape = Shape.of(side1, side2, side3);
    }
    
    public static Triangle of(double side1, double side2, double side3) {
        return new Triangle(side1, side2, side3);
    }

    private boolean isEquilateral() {
        Length side1 = shape.getSide(0);
        Length side2 = shape.getSide(1);
        Length side3 = shape.getSide(2);
        
        return side1.compareTo(side2) == 0 &&
                side2.compareTo(side3) == 0;
    }
    
    private boolean isScalene() {
        Length side1 = shape.getSide(0);
        Length side2 = shape.getSide(1);
        Length side3 = shape.getSide(2);
        
        return side1.compareTo(side2) != 0 &&
                side1.compareTo(side3) != 0 &&
                side2.compareTo(side3) != 0;
    }
    
    public TriangleType getType() {
        if (isEquilateral())
            return TriangleType.EQUILATERAL;
        
        if (isScalene())
            return TriangleType.SCALENE;
        
        return TriangleType.ISOSCELES;
    }
}
