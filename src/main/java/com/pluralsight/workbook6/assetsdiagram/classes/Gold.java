package com.pluralsight.workbook6.assetsdiagram.classes;

import java.math.BigDecimal;

public class Gold extends FixAsset {
    private double weight;

    Gold(String name, BigDecimal marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public BigDecimal getValue() {
        return new BigDecimal(this.weight).multiply(new BigDecimal("1234"));
    }
}
