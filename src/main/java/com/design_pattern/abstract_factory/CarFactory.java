package com.design_pattern.abstract_factory;

public class CarFactory implements VehicleAbstractFactory {

    @Override
    public Vehicle getVehicleInstance() {
        return new Car();
    }
}
