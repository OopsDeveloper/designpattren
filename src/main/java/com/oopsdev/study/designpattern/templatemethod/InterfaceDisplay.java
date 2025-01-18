package com.oopsdev.study.designpattern.templatemethod;

public interface InterfaceDisplay {
    void open();
    void print();
    void close();

    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
