package com.pluralsight.secondworkbook.encapsulation;

public class PersonFixedClass {
    private String name;
    private int age;
    private String favoriteColor;
    private String ssn;
    private boolean isFiction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public boolean isFiction() {
        return isFiction;
    }

    public void setFiction(boolean fiction) {
        isFiction = fiction;
    }

    public void read() {
        if (isFiction) {
            System.out.println("Ah, a fictional tale!");
        } else {
            System.out.println("Real-life drama, huh?");
        }
    }
}
