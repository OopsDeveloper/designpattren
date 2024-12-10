package com.oopsdev.designpattern.factorymethod.one;

abstract class VehicleFactory {
    // Factory Method
    abstract Vehicle createVehicle();

    // Operations using the factory method
    public void deliverVehicle() {
        Vehicle vehicle = createVehicle();
        System.out.println("Delivering the vehicle: ");
        vehicle.drive();
    }
}
