package com.pluralsight.workbook6.assetsdiagram;

import com.pluralsight.workbook6.assetsdiagram.classes.BankAccount;
import com.pluralsight.workbook6.assetsdiagram.classes.CreditCard;
import com.pluralsight.workbook6.assetsdiagram.classes.House;
import com.pluralsight.workbook6.assetsdiagram.classes.Portfolio;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Paulo Folio", "Paulo");
        BankAccount bankAccount = new BankAccount();

        CreditCard creditCard = new CreditCard();
        creditCard.charge(new java.math.BigDecimal("1000"));
        creditCard.pay(new java.math.BigDecimal("100"));

        House house = new House("Paulo's House", new BigDecimal("10_000_000"), 2025, 500, 10);


        portfolio.addValuable(bankAccount);
    }
}
