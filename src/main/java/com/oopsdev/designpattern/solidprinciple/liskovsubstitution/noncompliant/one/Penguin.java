package com.oopsdev.designpattern.solidprinciple.liskovsubstitution.noncompliant.one;

// Child class Penguin that violates LSP
public class Penguin extends Bird {
    @Override
    public void fly() {
        // Penguins cannot fly
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
