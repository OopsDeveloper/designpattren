package com.oopsdev.designpattern.solidprinciple.liskovsubstitution.compliant.one;

// Class for a bird that can fly
public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
