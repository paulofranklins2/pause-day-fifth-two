package com.pluralsight.secondworkbook.encapsulation;

public class App {
    public static void main(String[] args) {
        var bad = new PersonBadClass();

        bad.age = 20;
        bad.favoriteColor = "red";
        bad.ssn = "123";
        bad.name = "Wilmer";

        var good = new PersonFixedClass();
        good.setName("Ryan");
        good.setAge(20);
        good.setFavoriteColor("Blue");
        good.setSsn("321");

        good.setFiction(true);
        good.read();
        good.setFiction(false);
        good.read();
    }
}
