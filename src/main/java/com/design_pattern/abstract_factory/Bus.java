package com.design_pattern.abstract_factory;

public class Bus implements Vehicle{
    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public String brandName() {
        return "Volvo";
    }
}
