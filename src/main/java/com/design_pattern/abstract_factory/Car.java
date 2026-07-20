package com.design_pattern.abstract_factory;

import com.design_pattern.abstract_factory.Vehicle;

public class Car implements Vehicle {
    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public String brandName() {
        return "Hyundai";
    }
}
