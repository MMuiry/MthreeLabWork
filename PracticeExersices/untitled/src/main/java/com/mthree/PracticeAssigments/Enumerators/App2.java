package com.mthree.PracticeAssigments.Enumerators;

import java.util.Scanner;
public class App2 {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Would you like to Multiply, Divide, Subtract, Plus: ");
        int num1;
        int num2;
        MathOperator operator = MathOperator.valueOf(sc.nextLine().toUpperCase());
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        System.out.print(calculate(operator,num1,num2));
    }


    public static int calculate(MathOperator operator, int operand1, int operand2) {
        switch(operator) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}