package com.oopsdev.designpattern.solidprinciple.segregationinterface.compliant;

public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
    // Robot does not implement Eatable interface
}
