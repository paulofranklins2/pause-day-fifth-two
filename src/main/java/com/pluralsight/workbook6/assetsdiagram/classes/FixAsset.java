package com.pluralsight.workbook6.assetsdiagram.classes;

import com.pluralsight.workbook6.assetsdiagram.interfaces.Valuable;

import java.math.BigDecimal;

public abstract class FixAsset implements Valuable {
    private String name;
    private BigDecimal marketValue;

    FixAsset(String name, BigDecimal marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }
}
