package com.mthree.PracticeAssigments.ClassModeling;

import com.mthree.PracticeAssigments.Factorizer;
import com.mthree.PracticeAssigments.InterestCalculator;
import com.mthree.PracticeAssigments.LuckySevens;
import com.mthree.PracticeAssigments.RockPaperScissor;

import java.util.Scanner;

public class ApplicationPicker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        while (true) {
            System.out.print("What app would you like: RockPaperScissor(1), LuckySeven(2), InterestCalc(3), Factorizer(4)");
            option = sc.nextInt();
            if  (option == 1) {
                RockPaperScissor rps = new RockPaperScissor();
                rps.startGame();
            } else if (option == 2) {
                LuckySevens ls = new LuckySevens();
                ls.startGame();
            } else if (option == 3) {
                InterestCalculator ic = new InterestCalculator();
                ic.launchApplication();
            } else if (option == 4) {
                Factorizer f = new Factorizer();
            }

        }
    }
}
