package com.wellingtonmafra.domain.model;

import com.wellingtonmafra.exception.InvalidLengthException;

public class Triangle {
    
    private Length side1;
    private Length side2;
    private Length side3;

    public Triangle(Length side1, Length side2, Length side3) {
        if (side1 == null || side2 == null || side3 == null)
            throw new InvalidLengthException();
            
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean IsEquilateral() {
        return side1.compareTo(side2) == 0 &&
                side2.compareTo(side3) == 0;
    }
    
    private boolean isScalene() {
        return side1.compareTo(side2) != 0 &&
                side1.compareTo(side3) != 0 &&
                side2.compareTo(side3) != 0;
    }
    
    public TriangleType getType() {
        if (IsEquilateral())
            return TriangleType.EQUILATERAL;
        
        if (isScalene())
            return TriangleType.SCALENE;
        
        return TriangleType.ISOSCELES;
    }
}
