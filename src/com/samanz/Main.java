package com.samanz;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Main {

    public static void main(String[] args) {
        final byte MONTH_IN_YEAR =12;
        final byte PERCENT =100;
        int principal =0;
        float annualInterest =0;
        float monthlyInterest =0;
        int numberOfPayments =0;

                Scanner scanner = new Scanner(System.in );

        while (true) {
            System.out.println("Please add principal: ");
            principal = scanner.nextInt();
            if(principal >=1000 && principal<=1000-000)
                break;

                System.out.println("Enter Value between 1000 and 1000,000");
        }

        while (true) {
            System.out.println("annual Interest RaTe: ");
             annualInterest = scanner.nextFloat();
             if (annualInterest >=1 && annualInterest<=30) {
                 monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
                 break;
             }
            System.out.println("enter a value between 1 and 30");

        }
        while (true) {
            System.out.println("Period (Years); ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <=30) {
                numberOfPayments = years * MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage" + mortgageFormatted);




    }
}
