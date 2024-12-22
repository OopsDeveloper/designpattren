package com.oopsdev.designpattern.solidprinciple.dependencyinversion.noncompliant;

// Low-level class
public class Fan {
    public void spin() {
        System.out.println("Fan is spinning");
    }

    public void stop() {
        System.out.println("Fan is stopping");
    }
}
