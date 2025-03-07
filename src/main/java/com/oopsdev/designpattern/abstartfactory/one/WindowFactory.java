package com.oopsdev.designpattern.abstartfactory.one;

public class WindowFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
