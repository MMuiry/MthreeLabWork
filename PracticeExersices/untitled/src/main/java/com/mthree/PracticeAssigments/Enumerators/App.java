package com.mthree.PracticeAssigments.Enumerators;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("What day is it today?");
    DaysOfWeek userInput = DaysOfWeek.valueOf(sc.nextLine().toUpperCase());

        switch (userInput) {
            case MONDAY:
                System.out.println("4 days until Friday.");
                break;
            case TUESDAY:
                System.out.println("3 days until Friday.");
                break;
            case WEDNESDAY:
                System.out.println("2 days until Friday.");
                break;
            case THURSDAY:
                System.out.println("1 day until Friday.");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("6 days until Friday.");
                break;
            case SUNDAY:
                System.out.println("5 days until Friday.");
                break;
        }
    }
}
