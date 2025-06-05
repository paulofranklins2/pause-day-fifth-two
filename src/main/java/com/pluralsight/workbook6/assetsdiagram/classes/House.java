package com.pluralsight.workbook6.assetsdiagram.classes;

import java.math.BigDecimal;

public class House extends FixAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, BigDecimal marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public BigDecimal getValue() {
        return new BigDecimal(this.squareFeet * this.bedrooms).multiply(new BigDecimal("1000"));
    }
}
