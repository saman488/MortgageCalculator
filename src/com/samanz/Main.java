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


}
