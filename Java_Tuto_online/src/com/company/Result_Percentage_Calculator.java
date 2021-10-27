package com.company;
// Result percentage calculator for 5 subjects each out of 100 marks.
import java.util.Scanner;
public class Result_Percentage_Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Marks:-");
        System.out.println("Sub1:");
        int sub1 = s.nextInt();
        System.out.println("Sub2:");
        int sub2 = s.nextInt();
        System.out.println("Sub3:");
        int sub3 = s.nextInt();
        System.out.println("Sub4:");
        int sub4 = s.nextInt();
        System.out.println("Sub5:");
        int sub5 = s.nextInt();
        int total = sub1+sub2+sub3+sub4+sub5;

        int percen = (total*100)/500;
        System.out.println("-----------------------------");

        System.out.println("Your Obtained Marks:"+total);
        System.out.print("Your Pecentage:"+percen);
        System.out.println("%");


    }
}
