package com.design_pattern.abstract_factory;

public class VehicleFactory {
    public Vehicle getVehicleInstance(VehicleAbstractFactory vehicleAbstractFactory){
        return vehicleAbstractFactory.getVehicleInstance();
    }
}
