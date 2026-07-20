package com.design_pattern.factory;

public class Car implements Vehicle{
    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public String brandName() {
        return "Hyundai";
    }
}
