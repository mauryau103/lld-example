package main.java.org.example.strategyPattern.withStrategyPattern;


import main.java.org.example.strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
