package com.principles.single_reponsability.good;

public class Car implements Vehicle{
    @Override
    public int calculateVelocity() {
        return 100;
    }
}
