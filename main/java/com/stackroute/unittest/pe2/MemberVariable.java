package com.stackroute.unittest.pe2;

import java.util.Scanner;

public class MemberVariable {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Member member = new Member();
        member.setName(scanner.nextLine());
        member.setAge(scanner.nextInt());
        member.setSalary(scanner.nextDouble());
        MemberVariable memberVariable = new MemberVariable();
        System.out.println("Members Name: " + memberVariable.getName(member));
        System.out.println("Members Age: " + memberVariable.getAge(member));
        System.out.println("Members Salary: " + memberVariable.getSalary(member));
    }
    public String getName(Member member){
        return member.getName();
    }
    public int getAge(Member member){
        return member.getAge();
    }
    public double getSalary(Member member){
        return member.getSalary();
    }
}
