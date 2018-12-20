package com.stackroute.unittest.pe2;

import java.util.Scanner;

/*Write a program, which reads number of students and n grades as input (of int
between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
program shall check for valid input. You should keep all the grades in an int[] and
use a method for each of the computations.
 */

public class StudentEvaluation {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int noOfStudent = scanner.nextInt();
        StudentEvaluation studentEvaluation = new StudentEvaluation();
        int[] grades = new int[noOfStudent];
        for (int i = 0; i < noOfStudent; i++){
            System.out.println("Enter the grade for student " + i+1 + ": ");
            grades[i] = scanner.nextInt();
            if (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Wrong grade");
                break;
            }
        }
        System.out.println(studentEvaluation.average(grades));
        System.out.println(studentEvaluation.minimum(grades));
        System.out.println(studentEvaluation.maximum(grades));
    }
    public String average(int[] grades){
        float avg = 0;
        for (int i = 0; i < grades.length; i++){
            avg += grades[i];
        }

        return "The average is " + avg/grades.length;
    }
    public String minimum(int[] grades){
        int min = 100;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < min) min = grades[i];
        }
        return "The minimum is " + min;
    }
    public String maximum(int[] grades){
        int max = 0;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > max) max = grades[i];
        }
        return "The maximum is " + max;
    }
}
