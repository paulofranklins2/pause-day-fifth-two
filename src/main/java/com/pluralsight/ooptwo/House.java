package com.pluralsight.ooptwo;

public class House {
    private String color;
    private int amountOfRoom;
    private boolean hasBackYard;
    private boolean hasPool;

    public void openDoor() {
        System.out.println("openDoor");
    }

    public void closeDoor() {
        System.out.println("closeDoor");
    }

    public void getBackYard() {
        System.out.println("hasBackYard " + hasBackYard);
    }

    public void getPool() {
        System.out.println("hasPool " + hasPool);
    }

    public String getColor() {
        return color;
    }

    public int getAmountOfRoom() {
        return amountOfRoom;
    }

    public boolean getHasBackYard() {
        return hasBackYard;
    }

    public boolean getHasPool() {
        return hasPool;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAmountOfRoom(int amountOfRoom) {
        this.amountOfRoom = amountOfRoom;
    }

    public void setHasBackYard(boolean hasBackYard) {
        this.hasBackYard = hasBackYard;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void painHouse(String color) {
        this.color = color;
        System.out.println("painHouse " + color);
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + "\n" +
                "Amount Of Room: " + getAmountOfRoom() + "\n" +
                "hasBackYard: " + getHasBackYard() + "\n" +
                "hasPool: " + getHasPool() + "\n";
    }
}
