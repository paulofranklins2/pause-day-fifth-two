package com.pluralsight.workbook6.assetsdiagram.classes;

import com.pluralsight.workbook6.assetsdiagram.interfaces.Valuable;

import java.math.BigDecimal;

public class BankAccount implements Valuable {
    private BigDecimal balance;

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public BigDecimal getValue() {
        return this.balance;
    }
}
