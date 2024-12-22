package com.oopsdev.designpattern.solidprinciple.liskovsubstitution.compliant.two;

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
