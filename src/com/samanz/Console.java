package com.samanz;

import java.util.Scanner;

public class Console {
    public static double readNumber(String prompt,double min,double max){
        Scanner scanner = new Scanner(System.in);
        double vale;
        while (true) {
            System.out.print(prompt);
            vale = scanner.nextFloat();
            if (vale >=min && vale<=max)
                break;
            System.out.println("enter a value between "+ min + "and " + max);

        }
        return vale;

    }
}
