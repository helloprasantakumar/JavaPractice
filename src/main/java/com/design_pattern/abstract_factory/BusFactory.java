package com.design_pattern.abstract_factory;

public class BusFactory implements VehicleAbstractFactory{
    @Override
    public Vehicle getVehicleInstance() {
        return new Bus();
    }
}
