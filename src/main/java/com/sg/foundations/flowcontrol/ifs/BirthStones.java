package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Birth Stones! Enter your birthmonth: ");
        String birthmonth = sc.nextLine();
        switch (birthmonth) {
            case "1":
                System.out.println("Garnet");
                break;
            case "2":
                System.out.println("Amethyst");
                break;
            case "3":
                System.out.println("Aquamarine");
                break;
            case "4":
                System.out.println("Diamond");
                break;
            case "5":
                System.out.println("Emerald");
                break;
            case "6":
                System.out.println("Pearl");
                break;
            case "7":
                System.out.println("Ruby");
                break;
            case "8":
                System.out.println("Peridot");
                break;
            case "9":
                System.out.println("Sapphire");
                break;
            case "10":
                System.out.println("Opal");
                break;
            case "11":
                System.out.println("Topaz");
                break;
            case "12":
                System.out.println("Turquoise");
                break;
            default :
                System.out.println("Invalid input!");
        }





    }

}
