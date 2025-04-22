package com.pluralsight.secondweek.constructors;

public class House {
    private Room room;

    House(Room room) {
        this.room = room;
    }

    public void print() {
        System.out.println("This house has a room called: " + room.getName());
    }
}
