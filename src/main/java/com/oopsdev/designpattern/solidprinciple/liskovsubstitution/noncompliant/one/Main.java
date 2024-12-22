package com.oopsdev.designpattern.solidprinciple.liskovsubstitution.noncompliant.one;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Bird is flying

        Bird penguin = new Penguin();
        penguin.fly(); // Throws UnsupportedOperationException
    }
}
