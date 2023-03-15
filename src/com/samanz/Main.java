package com.samanz;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Main {

    public static void main(String[] args) {


        int principal=(int)readNumber("Principal",1000,1000000);
        float annualInterest=(float) (readNumber("Annual Interest Rate",1,30 ));
        byte  years = (byte) readNumber("Years",1,30);

        double mortgage = calculateMortgage(principal,annualInterest,years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage" + mortgageFormatted);

    }
    public static double readNumber(String promot,double min,double max){
        Scanner scanner = new Scanner(System.in);
        double vale;
        while (true) {
            System.out.println(promot);
            vale = scanner.nextFloat();
            if (vale >=min && vale<=max)
                break;
            System.out.println("enter a value between "+ min + "and " + max);

        }
        return vale;

    }

    public static double calculateMortgage(int principal,float annualInterest, byte years){

        final byte MONTH_IN_YEAR =12;
        final byte PERCENT =100;

        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short) (years * MONTH_IN_YEAR);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);



        return mortgage;

    }

}
