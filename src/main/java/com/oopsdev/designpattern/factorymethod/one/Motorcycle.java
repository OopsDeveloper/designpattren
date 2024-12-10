package com.oopsdev.designpattern.factorymethod.one;

public class Motorcycle implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Riding a motorcycle");
    }
}
