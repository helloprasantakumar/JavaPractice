package com.design_pattern.factory;

public class Bike implements Vehicle{
    @Override
    public String fuelType() {
        return "Petrol";
    }

    @Override
    public String brandName() {
        return "Hero";
    }
}
