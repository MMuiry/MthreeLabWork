package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
public class TriviaNight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correct = 0;
        System.out.println("Welcome to 4 trivia questions!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source Code\t\t2) Assembly Language");
        System.out.println("3) C#\t\t\t4) Machine Code");

        System.out.print("\nYOUR ANSWER: ");
        int answer1 = sc.nextInt();

        System.out.println("\nWebsite Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper\t\t2) Alan Turing");
        System.out.println("3) Charles Babbage\t\t4) Larry Page");

        System.out.print("\nYOUR ANSWER: ");
        int answer2 = sc.nextInt();

        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n");
        System.out.println("1) Serenity\t\t\t2) The Battlestar Galactica");
        System.out.println("3) The USS Enterprise\t\t4) The Millennium Falcon");

        System.out.print("\nYOUR ANSWER: ");
        int answer3 = sc.nextInt();

        if (answer1 == 3) {
            correct++;
        }
        if (answer2 == 2) {
            correct++;
        }
        if (answer3 == 4) {
            correct++;
        }
        System.out.println("Well done! you got Correct: " + correct);
    }

}
