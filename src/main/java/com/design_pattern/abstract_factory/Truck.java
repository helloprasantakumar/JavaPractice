package com.design_pattern.abstract_factory;

import com.design_pattern.abstract_factory.Vehicle;

public class Truck implements Vehicle {
    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public String brandName() {
        return "Ashok Leyland";
    }
}
