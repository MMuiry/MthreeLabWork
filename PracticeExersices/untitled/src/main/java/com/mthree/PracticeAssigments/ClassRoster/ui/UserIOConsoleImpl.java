package com.mthree.PracticeAssigments.ClassRoster.ui;


import java.util.Scanner;

//This is the console-specific implementation of the UserIO interface.
public class UserIOConsoleImpl implements UserIO {
    public static Scanner sc = new Scanner(System.in);
    public void print(String prompt) {
        System.out.println(prompt);
    }
    public String readString(String prompt) {
        System.out.print(prompt);
        String usrInput = sc.nextLine();
        return usrInput;
    }
    public int readInt(String prompt) {
        System.out.print(prompt);
        boolean validated = false;
        int userInput = 0;
        while (!validated) {
            if (!sc.hasNextInt()) {
                print("Wrong Type: Please enter an integer: ");
                sc.nextLine();
                continue;
            }
            validated = true;
            userInput = sc.nextInt();
            sc.nextLine();
        }
        return userInput;
    }

    public int readInt(String prompt, int min, int max) {
        System.out.print(prompt);
        boolean validated = false;
        int userNum = 0;
        while (!validated) {
            if (!sc.hasNextInt()) {
                print("Wrong Type: Please enter an integer with the range " + min + "-" + max);
                sc.nextLine();
                continue;
            }
            userNum = sc.nextInt();
            sc.nextLine();
            if (userNum < min || userNum > max) {
                print("Out of Range: Please enter an integer with the range " + min + "-" + max);
                continue;
            }
            validated = true;
        }
        return userNum;
    }

    public double readDouble(String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

    public double readDouble(String prompt,  double min, double max) {
        System.out.print(prompt);
        boolean validated = false;
        double userNum = 0;
        while (!validated) {
            if (!sc.hasNextDouble()) {
                print("Wrong Type: Please enter an double with the range " + min + "-" + max);
                sc.nextLine();
                continue;
            }
            userNum = sc.nextDouble();
            if (userNum < min || userNum > max) {
                print("Out of Range: Please enter an double with the range " + min + "-" + max);
                continue;
            }
            validated = true;
        }
        return userNum;
    }

    public float readFloat(String prompt) {
        System.out.print(prompt);
        return sc.nextFloat();
    }
    public  float readFloat(String prompt, float min, float max) {
        System.out.print(prompt);
        boolean validated = false;
        float userNum = 0;
        while (!validated) {
            if (!sc.hasNextFloat()) {
                print("Wrong Type: Please enter an float with the range " + min + "-" + max);
                sc.nextLine();
                continue;
            }
            userNum = sc.nextFloat();
            if (userNum < min || userNum > max) {
                print("Out of Range: Please enter an float with the range " + min + "-" + max);
                continue;
            }
            validated = true;
        }
        return userNum;
    }

    public long readLong(String prompt) {
        System.out.print(prompt);
        return sc.nextLong();
    }

    public long readLong(String prompt, long min, long max) {
        System.out.print(prompt);
        boolean validated = false;
        long userNum = 0;
        while (!validated) {
            if (!sc.hasNextLong()) {
                print("Wrong Type: Please enter an long with the range " + min + "-" + max);
                sc.nextLine();
                continue;
            }
            userNum = sc.nextLong();
            if (userNum < min || userNum > max) {
                print("Out of Range: Please enter an long with the range " + min + "-" + max);
                continue;
            }
            validated = true;
        }
        return userNum;
    }



}

