package com.sg.foundations.flowcontrol.random;
import java.util.Scanner;
import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char coinRestult;
        System.out.println("The coin has been flipped! quick pick Heads of Tails! (H/T)");
        char userChoice = sc.next().charAt(0);
        double coinPerc = rand.nextDouble();
        if (coinPerc < 0.5) {
            coinRestult = 'h';
        }  else {
            coinRestult = 't';
        }
        if (coinRestult == userChoice) {
            System.out.println("You guessed right!");
        } else {
            System.out.println("You guessed wrong!");
        }



    }
}
