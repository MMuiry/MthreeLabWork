package com.sg.foundations.flowcontrol.random;
import java.util.Scanner;

import java.util.Random;

public class HighRoller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random diceRoller = new Random();


        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.print("Pick the number of sides the dice has!:");
        int diceNum = sc.nextInt();
        int rollResult = diceRoller.nextInt(diceNum) + 1;

        System.out.println("I rolled a " + rollResult);


        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        } else if (rollResult == diceNum) {
            System.out.println("You rolled a critical! good job!");
        }
    }
}
