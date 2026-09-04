package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class YourLifeInMovies {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int userAge;
     System.out.println("Welcome to how old are you!");
     System.out.println("Enter your birth year: ");
     userAge = sc.nextInt();

     if (userAge < 2005) {
         System.out.println(" Pixar's 'Up' came out over a decade ago");
     }
     if (userAge < 1995) {
         System.out.println("Harry Potter came out over 15 years ago");
     }
     if (userAge < 1985) {
         System.out.println("Space Jam came out not last decade, but the one before THAT");
     }
     if (userAge < 1975) {
         System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today");
     }
     if (userAge < 1965) {
         System.out.println("MASH TV series has been around for almost half a century!");
     }







 }

}
