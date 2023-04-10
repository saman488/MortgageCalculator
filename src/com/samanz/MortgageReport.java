package com.samanz;

import java.text.NumberFormat;

public class MortgageReport {
    private  MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.print("PAYMENT SCHEDULE HEADING");
        System.out.println("_______________________");
        for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTH_IN_YEAR; month++) {
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("__________________________________");
        System.out.println("Monthly payments = " + mortgageFormatted);
    }
}
