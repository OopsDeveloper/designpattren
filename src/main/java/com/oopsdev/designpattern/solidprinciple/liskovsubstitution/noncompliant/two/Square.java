package com.oopsdev.designpattern.solidprinciple.liskovsubstitution.noncompliant.two;

// Subclass violating LSP
class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
