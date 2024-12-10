package com.oopsdev.designpattern.factorymethod.two;

public class Book implements Product {
    @Override
    public void create() {
        System.out.println("Book product created.");
    }
}