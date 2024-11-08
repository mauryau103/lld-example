package main.java.org.example.strategyPattern.withStrategyPattern;


import main.java.org.example.strategyPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
