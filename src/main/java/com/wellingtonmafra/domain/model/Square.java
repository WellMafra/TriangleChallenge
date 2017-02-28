package com.wellingtonmafra.domain.model;

import java.io.Serializable;

public class Square implements Serializable {
        
    private static final long serialVersionUID = 6410482058475309247L;
    
    private Shape shape;

    private Square() {
    }
    
    private Square(double side1, double side2, double side3, double side4) {
        shape = Shape.of(side1, side2, side3, side4);
    }
    
    public static Square of(double side1, double side2, double side3, double side4) {
        return new Square(side1, side2, side3, side4);
    }

    public boolean isPerfect() {
        Length side1 = shape.getSide(0);
        Length side2 = shape.getSide(1);
        Length side3 = shape.getSide(2);
        Length side4 = shape.getSide(3);
        
        return side1.compareTo(side2) == 0 &&
                side1.compareTo(side3) == 0 &&
                side1.compareTo(side4) == 0;
    }
}
