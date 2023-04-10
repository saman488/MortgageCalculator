package com.samanz;

public class Main {
    final static byte MONTH_IN_YEAR =12;
    final static byte PERCENT =100;

    public static void main(String[] args) {
        int principal=(int) Console.readNumber("Principal:",1000,1000_000);
        float annualInterest=(float) Console.readNumber("Annual Interest Rate:",1,30 );
        byte  years = (byte) Console.readNumber("Years:",1,30);

        Mortgagereport.printMortgage(principal, annualInterest, years);
        Mortgagereport.printPaymentSchedule(principal, annualInterest, years);

    }

    public static double calculateBalance(int principal,
                                          float annualInterest,
                                          byte years,
                                          short numberOfPaymentsMade
    ){
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        float numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        double balance = principal
                * (Math.pow(1 + monthlyInterest,numberOfPayments) - Math.pow( 1 + monthlyInterest,numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);

        return balance;


    }


    public static double calculateMortgage(int principal,
                                           float annualInterest,
                                           byte years
    ){
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);



        return mortgage;

    }

}
