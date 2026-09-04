package com.sg.foundations.flowcontrol.fors;

public class ForAndTwentyBlackbirds {

    public static void main(String[] args) {
        int birdsInPie = 0;
        for (int i = 1; i <= 24; i++) { //made it stop the loop when it got to 25
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}