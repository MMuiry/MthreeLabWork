package com.mthree.PracticeAssigments.CalcProject;

import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    private static boolean endProgram = false;
    public static App app = new App();
    public static int option;
    public static int num1;
    public static int num2;
    private SimpleCalculator calc =  new SimpleCalculator();
    private static UserIO  iO = new UserIOImpl();
    private static String output;


    public static void main(String[] args) {
        while (option != 5) {
            //System.out.println("Welcome to the calculator app!\n1) Perform an addition\n2) Perform a subtraction\n3) Perform a multiplication\n3) Perfrom an multiplication\n4) Perform a division\n5) Exit program");
            iO.print("Welcome to the calculator app!\n1) Perform an addition\n2) Perform a subtraction\n3) Perform a multiplication\n3) Perfrom an multiplication\n4) Perform a division\n5) Exit program");
            app.validateOptionInput();
            if (option == 5) {
                continue;
            }
            num1 = iO.readInt("Enter the first number: ");
            num2 = iO.readInt("Enter the second number: ");
            System.out.println(num1);
            //System.out.print("Enter first number: ");
            //num1 = validateNumInput();
            //System.out.print("Enter second number: ");
            //num2 = validateNumInput();
            double result = app.performCalc();
            //System.out.println("The result is: " + result);
            //output = "The result is: " + result)
            iO.print("The result is: " + result);
        }
        System.out.println("Thank you for using the app, Good bye!");
    }

    private double performCalc() {
        double result = 0;
        if (option == 1) {
            result = calc.addition(num1,num2);
        } else if (option == 2) {
            result = calc.subtraction(num1,num2);
        } else if (option == 3) {
            result = calc.multiplication(num1,num2);
        } else if (option == 4) {
            result = calc.division(num1,num2);
        }
        return result;
    }

    private static int validateNumInput() {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter an integer: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private void validateOptionInput() {
        option = iO.readInt("Please select an option: ", 1, 5);
        //System.out.print("Please select an option: ");
//        boolean validated = false;
//        while (!validated) {
//            if (!sc.hasNextInt()) {
//                System.out.println("This isn't a Int, please try again (1-5): ");
//                sc.next();
//            } else {
//                option = sc.nextInt();
//                if (option > 5 || option < 1) {
//                    System.out.println("This isn't between 1-5, please try again (1-5): ");
//                } else {
//                    validated = true;
//                }
//
//            }
//        }
    }
}