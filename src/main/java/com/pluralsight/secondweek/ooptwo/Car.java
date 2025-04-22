package com.pluralsight.secondweek.ooptwo;

public class Car {
    String make;
    String model;
    String color;
    int year;
    boolean engineOff;
    int topSpeed;
    int currentSpeed;

    public void openDoor() {
        System.out.println("openDoor");
    }

    public void startEngine() {
        engineOff = true;
        System.out.println("startEngine");
    }

    public void stopEngine() {
        engineOff = false;
        System.out.println("stopEngine");
    }

    public void honk() {
        System.out.println("honk-honk");
    }

    public void accelerate() {
        currentSpeed += 5;
        System.out.println("currentSpeed: " + currentSpeed);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isEngineRunning() {
        System.out.println("isEngineOff: " + engineOff);
        return engineOff;
    }

    @Override
    public String toString() {
        return "Make: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "Color: " + getColor() + "\n" +
                "Year: " + getYear() + "\n" +
                "Top Speed: " + getTopSpeed() + "\n";
    }
}
