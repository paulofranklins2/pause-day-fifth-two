package com.pluralsight.workbook6;

import java.util.ArrayList;
import java.util.List;

public class ChihuahuaBag {
    List<Chihuahua> items;

    ChihuahuaBag() {
        items = new ArrayList<>();
    }

    public void add(Chihuahua chihuahua) {
        items.add(chihuahua);
    }

    public void printContents() {
        for (Chihuahua chihuahua : items) {
            System.out.println(chihuahua);
        }
    }
}

