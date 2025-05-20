package com.pluralsight.workbook6;

import java.util.ArrayList;
import java.util.List;

public class LaptopBag {
    List<Laptop> items;

    LaptopBag() {
        items = new ArrayList<>();
    }

    public void add(Laptop laptop) {
        items.add(laptop);
    }

    public void printContents() {
        for (Laptop laptop : items) {
            System.out.println(laptop);
        }
    }
}
