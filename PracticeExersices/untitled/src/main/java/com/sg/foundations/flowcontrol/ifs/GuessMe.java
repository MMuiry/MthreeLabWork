package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int computerChoice = 5;
        int userChoice;
        System.out.println("Welcome to the Guess Me! Pick a number between 1 - 10:");
        userChoice = sc.nextInt();
        if (userChoice == computerChoice) {
            System.out.println(userChoice + " was an amazing guess!! you got it correct!");
        } else if (userChoice < computerChoice) {
            System.out.println(userChoice + " was a good guess... but too low!");
        } else if (userChoice > computerChoice) {
            System.out.println(userChoice + " was a good guess... but too high!");
        }


    }

}
