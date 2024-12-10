package com.oopsdev.designpattern.factorymethod.one;

public class CarFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
