package com.pluralsight.workbook6.assetsdiagram.classes;

import com.pluralsight.workbook6.assetsdiagram.interfaces.Valuable;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String Owner;
    ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        Owner = owner;
        this.valuables = new ArrayList<>();
    }

    public void addValuable(Valuable valuable) {
        this.valuables.add(valuable);
    }

    public BigDecimal getTotalValue() {
        BigDecimal totalValue = BigDecimal.ZERO;
        for (Valuable valuable : valuables) {
            totalValue = totalValue.add(valuable.getValue());
        }
        return totalValue;
    }
}
