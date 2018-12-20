package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class Power4 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        Power4 power = new Power4();
        System.out.println(power.check(num));
    }
    public String check(double num){
        double x = Math.log(num)/ Math.log(4);
        if (x % 1 == 0) {
            return "Number is power of 4";
        }
        else {
            return "Number is not the power of 4";
        }
    }
}
