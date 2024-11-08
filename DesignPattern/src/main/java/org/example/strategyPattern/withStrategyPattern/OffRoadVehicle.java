package main.java.org.example.strategyPattern.withStrategyPattern;


import main.java.org.example.strategyPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
