package com.pluralsight.workbook6.assetsdiagram.classes;

import java.math.BigDecimal;

public class Jewelry extends FixAsset {
    private double karat;

    Jewelry(String name, BigDecimal marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public BigDecimal getValue() {
        return new BigDecimal(karat).multiply(new BigDecimal("1000000"));
    }
}
