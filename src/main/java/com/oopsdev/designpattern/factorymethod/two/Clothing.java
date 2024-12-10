package com.oopsdev.designpattern.factorymethod.two;

public class Clothing implements Product {
    @Override
    public void create() {
        System.out.println("Clothing product created.");
    }
}
