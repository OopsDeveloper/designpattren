package com.oopsdev.designpattern.solidprinciple.segregationinterface.compliant;

public class Employee implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }
}
