package com.design_pattern.abstract_factory;

import com.design_pattern.abstract_factory.VehicleFactory;

public class BikeFactory implements VehicleAbstractFactory {

    @Override
    public Vehicle getVehicleInstance() {
        return new Bike();
    }
}
