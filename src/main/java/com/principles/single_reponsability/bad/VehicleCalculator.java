package com.principles.single_reponsability.bad;

public class VehicleCalculator {

    public int calculateVelocity(Vehicle vehicle){

        if(vehicle.getName()=="car") {
            return 100;
        } else if(vehicle.getName()=="motorcycle") {
            return 80;
        } else {
            return 60;
        }

    }
}
