package com.oopsdev.designpattern.abstartfactory.one;

// abstract factory interface
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
