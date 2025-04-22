package com.pluralsight.secondworkbook.ooptwo;

public class App {
    public static void main(String[] args) {
        var house = new House();
        house.setColor("blue");
        house.setAmountOfRoom(2);
        house.setHasBackYard(true);
        house.setHasPool(false);
        System.out.println(house);

        System.out.println();

        var car = new Car();
        car.setColor("blue");
        car.setMake("ford");
        car.setModel("f150");
        car.setYear(2066);
        car.setTopSpeed(99999);
        System.out.println(car);

        house.painHouse("black");
        house.openDoor();

        car.startEngine();
        car.stopEngine();
        car.isEngineRunning();

    }
}
