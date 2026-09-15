package com.mthree.PracticeAssigments;
import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static int highestBal;
    public static int highestBalRole;
    public int totalRoll;
    public static int roundOfRole;
    public static int bal;
    public static Random  rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    public  void startGame() {
        LuckySevens ls = new LuckySevens();
        System.out.print("Please enter the money you would like to bet with: ");
        bal = sc.nextInt();
        highestBal = bal;
        while(bal > 0) {
            ls.rollDice();
            ls.calcReturns();
            ls.modifyHighestReturns();
            roundOfRole++;
        }
        System.out.println("You are broke after " + roundOfRole + " rolls");
        System.out.println("You should have quit after " + highestBalRole + " when you had $" + highestBal);
    }

    public void rollDice(){
        int dice1 = rand.nextInt(7) + 1;
        int dice2 = rand.nextInt(7) + 1;
        totalRoll = dice1 + dice2;
    }

    public void calcReturns() {
        if (totalRoll == 7) {
            bal += 4;
        } else  {
            bal -= 1;
        }
    }

    public void modifyHighestReturns() {
        if (bal > highestBal) {
            highestBal = bal;
            highestBalRole = roundOfRole;
        }
    }

}


