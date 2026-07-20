package com.design_pattern.factory;

public class VehicleFactory {

    public  Vehicle getVehicleDetails(String vehicleType){
        if (vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }
        if(vehicleType.equalsIgnoreCase("BIKE")){
            return new Bike();
        }
        return null;
    }


}
