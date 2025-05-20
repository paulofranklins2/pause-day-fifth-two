package com.pluralsight.week7.workbookexercise;

public class RidingMower implements Drivable, PowerTool{
    private String make;
    private String model;
    private String blade;
    private int speed;

    public RidingMower(String make, String model, String blade, int speed) {
        this.make = make;
        this.model = model;
        this.blade = blade;
        this.speed = speed;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void turnOn() {
        System.out.println("Riding mower is on");
    }

    @Override
    public void repair() {
        System.out.println("Riding mower is repaired");
    }
}
