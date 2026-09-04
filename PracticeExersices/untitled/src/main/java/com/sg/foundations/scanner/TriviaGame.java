package com.sg.foundations.scanner;
import java.util.Scanner;
public class TriviaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String anws1, anws2, anws3, anws4;

        System.out.println("Welcome to the Trivia Game!");
        System.out.print("What is the capital of England: ");
        anws1 = sc.nextLine();
        System.out.print("Name an animal with wings that can't fly: ");
        anws2 = sc.nextLine();
        System.out.print("what year was google created: ");
        anws3 = sc.nextLine();
        System.out.print("how many times bigger is the earth compared to the moon: ");
        anws4 = sc.nextLine();


        System.out.println("I didn't know the capital of England was " + anws2);
        System.out.println("I sure hope " + anws1 + " can't fly, Imagine that!");
        System.out.println("hmm the earth is big but not " + anws3 + " times bigger! ");
        System.out.println("you think google was invented in " + anws4 + " which was closer to jeusus than to now?....");




    }
}
