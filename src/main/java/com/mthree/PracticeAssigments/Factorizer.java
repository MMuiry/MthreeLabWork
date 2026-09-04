package com.mthree.PracticeAssigments;

import java.util.ArrayList;
import  java.util.Scanner;
import java.util.List;

public class Factorizer {
    public Scanner sc  = new Scanner(System.in);
    public int userNumber;
    public List<Integer> factors = new ArrayList<>();
    
    public static void main(String[] args) {
        Factorizer f = new Factorizer();
        f.inputFromUser();
        f.calculateFactors();
        f.isItAPerfectNumber();
        f.isItAPrimeNumber();
    }

    private void isItAPrimeNumber() {

        if (factors.size() == 1) {
            System.out.println("This is a prime number");
        } else {
            System.out.print("This is not a prime number");

        }
    }

    private void isItAPerfectNumber() {
        int num = 0;

        for (int i = 0; i < factors.size(); i++) {
            num += factors.get(i);
        }

        if (num == userNumber) {
            System.out.println("This is a perfect number");
        } else {System.out.println("This is not a perfect number");}

    }

    private void calculateFactors() {

        for (int i = (userNumber/2); i > 0; i--) {

            if (userNumber % i == 0) {
                factors.add(i);
            }
        }

        System.out.println("Factors: " + factors);
        System.out.println("Number of factors: " + factors.size());
    }


    private void inputFromUser() {
        System.out.print("Enter Number: ");
        userNumber = sc.nextInt();
    }
}
