package com.oopsdev.designpattern.templatemethod.one;

class Tea extends Beverage {
    void brew() {
        System.out.println("Steeping the tea");
    }

    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
