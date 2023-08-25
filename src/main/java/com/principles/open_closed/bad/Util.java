package com.principles.open_closed.bad;

public class Util {
    public void draw(Vehicle vehicle){
        switch (vehicle.getType()) {
            case CAR:
                drawCar(vehicle);
                break;
            case MOTORBIKE:
                drawMotorbike(vehicle);
                break;
        }
    }

    private void drawCar(Vehicle vehicle){
        // draw car
    }

    private void drawMotorbike(Vehicle vehicle){
        // draw motorbike
    }
}
