package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.palindrome(string));
    }
    public String palindrome(String string){
        StringBuilder rev = new StringBuilder(string);
        rev.reverse();
        if (rev.toString().equals(string)) {
            return "Palindrome";
        }
        else {
            return "Not Palindrome";
        }
    }
}
