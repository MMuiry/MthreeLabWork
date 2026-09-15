package com.mthree.PracticeAssigments.StateCapital;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class StateCapital2 {

    public static void main(String[] args) throws Exception {
        Map<String,String> captials = new HashMap<>();
        Scanner scFile = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        Scanner sc = new Scanner(System.in);
        while (scFile.hasNextLine()) {
            String currentLine = scFile.nextLine();
            String[] parts = currentLine.split("::");
            captials.put(parts[0],parts[1]);
        }
        scFile.close();
        System.out.println(captials.size() + "States & CAPITALS ARE LOADED\n======");
        System.out.println("HERE ARE THE STATES :");
        for (String key : captials.keySet()) {
            System.out.print(key + ",");
        }
        Random rand = new Random();
        List<String> keys =  new ArrayList<>(captials.keySet());
        String rndState = keys.get(rand.nextInt(keys.size()));
        System.out.println("\nReady to test your knowledge? what is the capital of " + rndState + "?");
        String usrGuess = sc.nextLine();
        if (usrGuess.equalsIgnoreCase(captials.get(rndState))) {
            System.out.println("You guess right! it was " + captials.get(rndState));
        } else {System.out.println("You guessed wrong! It was " + captials.get(rndState));}

    }
}
