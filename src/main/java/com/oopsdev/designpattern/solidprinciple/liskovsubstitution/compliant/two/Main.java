package com.oopsdev.designpattern.solidprinciple.liskovsubstitution.compliant.two;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // LSP Compliant
        Shape rectangle = new Rectangle(5, 4);
        calculator.calculateArea(rectangle); // Output: Area: 20

        Shape square = new Square(5);
        calculator.calculateArea(square); // Output: Area: 25 (Expected)
    }
}
