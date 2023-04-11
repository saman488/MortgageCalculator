package com.samanz;

import java.text.NumberFormat;

public class MortgageReport {
    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.print("PAYMENT SCHEDULE HEADING");
        System.out.println("_______________________");
        for (double balance :calculator.getRemainingBalances()){
            System.out.println(currency.format(balance));
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("__________________________________");
        System.out.println("Monthly payments = " + mortgageFormatted);
    }
}
