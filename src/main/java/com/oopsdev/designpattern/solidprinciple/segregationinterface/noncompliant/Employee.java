package com.oopsdev.designpattern.solidprinciple.segregationinterface.noncompliant;

public class Employee implements Worker {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }
}
