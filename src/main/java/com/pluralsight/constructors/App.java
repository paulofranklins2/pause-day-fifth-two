package com.pluralsight.constructors;

public class App {
    public static void main(String[] args) {

        var book = new Book("Ble Ble", "Wilmer", 1);
        book.describe();
        var book2 = new Book("Bla Bla", "Maaike", 2);
        book2.describe();
        var book3 = new Book("Bli Bli", "Ryan", 3);
        book3.describe();

        var book4 = new Book();
        book4.describe();

        var cupCake = new Cupcake("Chocolate", 500);
        var cupCake2 = new Cupcake("Vanilla", 100);

        var planet = new Planet("Earth", 500);
        var planet2 = new Planet("Pluto", 100);

        var car = new Car("Tesla", 2022, true);
        car.startEngine();
        var car2 = new Car("Charger", 2022, false);
        car2.startEngine();

        var room = new Room("bla bla");
        var house = new House(room);
        house.print();

        var rectangle = new Rectangle(10, 20);
        double area = rectangle.getArea();
        System.out.println(area);
    }
}
