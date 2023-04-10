package com.samanz;

public class MortgageCalculator {
    private int principal;
    private byte years;
    private float annualInterest;

    public MortgageCalculator(int principal, byte years, float annualInterest) {
        this.principal = principal;
        this.years = years;
        this.annualInterest = annualInterest;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTH_IN_YEAR;
        float numberOfPayments = years * Main.MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;


    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * Main.MONTH_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        return mortgage;

    }
}
