package main.java.org.example.strategyPattern.withStrategyPattern;


import main.java.org.example.strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
