package com.oopsdev.designpattern.abstartfactory.one;

public class WindowCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Window style");
    }
}
