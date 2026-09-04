package com.sg.foundations.scanner;
import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, userColour, favFood, favNum;
        String aiName = "Alex";
        System.out.print("What is your name?: ");
        userName = sc.nextLine();
        System.out.print(userName + " is a wonderful name! My name is " + aiName + "\nWhat is your favourite colour!");
        userColour = sc.nextLine();
        System.out.print(userColour + " is my fav colour as well!\n my fav food is pizza, what is yours? : ");
        favFood = sc.nextLine();
        System.out.print(favFood + " isn't somthing I like but no judgment!");


    }

}
