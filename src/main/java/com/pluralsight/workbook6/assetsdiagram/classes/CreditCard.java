package com.pluralsight.workbook6.assetsdiagram.classes;

import com.pluralsight.workbook6.assetsdiagram.interfaces.Valuable;

import java.math.BigDecimal;

public class CreditCard implements Valuable {
    private BigDecimal debit;

    public void pay(BigDecimal amount) {
        this.debit = this.debit.subtract(amount);
    }

    public void charge(BigDecimal amount) {
        this.debit = this.debit.add(amount);
    }

    @Override
    public BigDecimal getValue() {
        return this.debit;
    }
}
