package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter a year: ");
            int year = input.nextInt();
            boolean isLeapYear = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }
            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
            System.out.print("Do you want to continue? (y/n): ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                exit = true;
            }
        }
    }
}