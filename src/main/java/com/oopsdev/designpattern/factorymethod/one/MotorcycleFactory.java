package com.oopsdev.designpattern.factorymethod.one;

public class MotorcycleFactory extends VehicleFactory{
    @Override
    Vehicle createVehicle() {
        return new Motorcycle();
    }
}
