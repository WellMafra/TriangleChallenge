package com.wellingtonmafra.domain.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import com.wellingtonmafra.exception.InvalidShapeException;

public class Shape implements Serializable {
    
    private static final long serialVersionUID = 4653291334646545870L;
    
    private ArrayList<Length> sides;
    
    private Shape() {
    }
        
    private Shape(ArrayList<Length> sides) {
        this.sides = sides;
    }
        
    public static Shape of(double... sides) {
        if (sides == null || sides.length <= 0) {
            throw new InvalidShapeException();
        }
        return new Shape(DoubleStream.of(sides).mapToObj(Length::of).collect(Collectors.toCollection(ArrayList::new)));
    }
    
    public Length getSide(int index) {
        return sides.get(index);
    }
}
