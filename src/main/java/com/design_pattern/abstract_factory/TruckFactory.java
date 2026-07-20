package com.design_pattern.abstract_factory;

public class TruckFactory implements VehicleAbstractFactory {

    @Override
    public Vehicle getVehicleInstance() {
        return new Truck();
    }
}
