package com.sg.foundations.flowcontrol.random;
import java.util.Random;

public class FortuneCookie {

    public static void main(String[] args) {
        System.out.println("Welcome to pull a fortune! here is your fortune:\n");
        Random rNum = new Random();
        int num = rNum.nextInt(5) + 1;
        switch (num) {
            case 1:
                System.out.println("Those aren't the droids you're looking for!");
                break;
            case 2:
                System.out.println("Never go in against a Sicilian when death is on the line!");
                break;
            case 3:
                System.out.println("Goonies never say die!");
                break;
            case 4:
                System.out.println("Never argue with the data!");
                break;
            case 5:
                System.out.println("Try not. Do, or do not. There is no try.!");
                break;
            case 6:
                System.out.println("You are a leaf on the wind, watch how you soar!");
                break;

        }




    }

}
