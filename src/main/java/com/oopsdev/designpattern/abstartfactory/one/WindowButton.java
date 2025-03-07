package com.oopsdev.designpattern.abstartfactory.one;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Window style");
    }
}
