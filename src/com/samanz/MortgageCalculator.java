package com.samanz;

public class MortgageCalculator {
    public final static byte MONTH_IN_YEAR =12;
    public final static byte PERCENT =100;
    private int principal;

    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal,float annualInterest,byte years) {
        this.principal = principal;
        this.years = years;
        this.annualInterest = annualInterest;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        float numberOfPayments = years * MONTH_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        float numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        return mortgage;

    }
    public short getYears(){
        return years;
    }
}
