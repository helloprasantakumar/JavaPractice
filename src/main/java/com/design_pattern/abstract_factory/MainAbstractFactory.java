package com.design_pattern.abstract_factory;

import com.design_pattern.abstract_factory.VehicleFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        VehicleFactory vf= new VehicleFactory();
        Vehicle vehicle= vf.getVehicleInstance(new BikeFactory());
        System.out.println(vehicle.brandName() +" -> "+ vehicle.fuelType());

        Vehicle busVehicle= vf.getVehicleInstance(new BusFactory());
        System.out.println(busVehicle.brandName()+" -> "+busVehicle.fuelType());
    }
}
