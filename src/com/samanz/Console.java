package com.samanz;

import java.util.Scanner;

public class Console {
    private static Scanner scanner =new Scanner(System.in);
    public static double readNumber(String prompt){
        return scanner.nextDouble();

    }
    public static double readNumber(String prompt,double min,double max){
        double vale;
        while (true) {
            System.out.print(prompt);
            vale = scanner.nextDouble();
            if (vale >=min && vale<=max)
                break;
            System.out.println("enter a value between "+ min + "and " + max);

        }
        return vale;

    }
}
