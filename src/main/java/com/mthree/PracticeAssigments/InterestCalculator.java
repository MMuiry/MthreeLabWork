package com.mthree.PracticeAssigments;

import java.util.Scanner;

public class InterestCalculator {
    public Scanner sc = new Scanner(System.in);
    public int years;
    public int amountInvesting;
    public double interestRate;


    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();
        System.out.print("Welcome to the interest calculator");
        ic.questions();
        ic.calculateAndDisplay();

    }

    private void calculateAndDisplay() {
        double yearBeginning = amountInvesting;
        for (int i = 1; i <= years; i++) {
            System.out.println("Year " + i + ": ");
            System.out.println("Began with $" + yearBeginning);
            System.out.println("Earned $" + ((interestRate/100)*yearBeginning));
            System.out.println("Ended with $" + (yearBeginning + ((interestRate/100)*amountInvesting)) + "\n");
            //yearBeginning = (double) Math.round(yearBeginning + ((interestRate / 100) * yearBeginning) * 100) /100;
            yearBeginning = Math.round((yearBeginning + (interestRate / 100) * yearBeginning) * 100) / 100.0;

        }

    }

    private void questions() {
        System.out.print("How much do you want to invest?: ");
        amountInvesting = sc.nextInt();
        System.out.print("How many years are you investing: ");
        years = sc.nextInt();
        System.out.print("What is the annual interest rate % growth?: ");
        interestRate = sc.nextDouble();
    }

}
