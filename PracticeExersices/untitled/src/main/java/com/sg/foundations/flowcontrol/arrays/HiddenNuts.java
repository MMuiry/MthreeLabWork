package com.sg.foundations.flowcontrol.arrays;
import java.util.Random;
public class HiddenNuts {


    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        System.out.println("Lets go find it...");
        for (int i = 0; i < hidingSpots.length; i++) {
            if ("nut".equalsIgnoreCase(hidingSpots[i])) {
                System.out.println("Found it!");
                break;
            } else {
                System.out.println("its not in hiding spot #" + i);
            }
            // Nut finding code should go here!
        }
    }
}
