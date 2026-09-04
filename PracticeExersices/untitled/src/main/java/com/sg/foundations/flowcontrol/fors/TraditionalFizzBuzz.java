package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;


public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many units of fizzing and buzzing do you need in your life? \n");
        int target = sc.nextInt();
        int count = 0;
        for (int i = 1; count < target; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                count++;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                count++;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                count++;
            } else { System.out.println(i); }


        }
        System.out.println("Tradition!");




    }

}
