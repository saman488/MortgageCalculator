package com.samanz;

import java.text.NumberFormat;

public class Mortgagereport {
    public static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = Main.calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("__________________________________");
        System.out.println("Monthly payments = " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.print("PAYMENT SCHEDULE HEADING");
        System.out.println("_______________________");
        for (short month = 1; month <= years * Main.MONTH_IN_YEAR; month++) {
            double balance = Main.calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
