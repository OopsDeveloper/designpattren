package com.oopsdev.designpattern.solidprinciple.liskovsubstitution.compliant.two;

// Client code
class AreaCalculator {
    public void calculateArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
}
