package com.pluralsight.workbook6;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    List<T> items;

    Bag() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void printContents() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
