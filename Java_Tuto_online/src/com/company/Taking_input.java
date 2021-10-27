package com.company;
import java.util.Scanner;
public class Taking_input {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Taking input from the 'Scanner'!");
        System.out.println("Enter your name:");
        String name =s.next();
        System.out.println("Enter your age:");
        int age = s.nextInt();
        System.out.println("Enter your gender:");
        char gender =s.next().charAt(0);
        System.out.println("Enter your mob no.:");
        long mob = s.nextLong();

        System.out.println("----------------------------");
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Gender="+gender);
        System.out.println("Mob no.="+mob);



    }
}
