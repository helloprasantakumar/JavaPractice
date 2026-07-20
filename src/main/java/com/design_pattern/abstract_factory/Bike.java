package com.design_pattern.abstract_factory;

import com.design_pattern.abstract_factory.Vehicle;

public class Bike implements Vehicle {
    @Override
    public String fuelType() {
        return "Petrol";
    }

    @Override
    public String brandName() {
        return "Hero";
    }
}
