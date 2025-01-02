package com.oopsdev.designpattern.solidprinciple.dependencyinversion.compliant;

public class main {
    public static void main(String[] args) {

        Switch fanSwitch = new Switch(new Fan());

        fanSwitch.turnOn();
        fanSwitch.turnOff();
    }
}
