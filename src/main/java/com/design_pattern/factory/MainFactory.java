package com.design_pattern.factory;

public class MainFactory {
    public static void main(String[] args) {

        VehicleFactory vf= new VehicleFactory();

        Vehicle vehicle= vf.getVehicleDetails("CAR");
        System.out.println(vehicle.brandName()+"->"+vehicle.fuelType());

    }
}
