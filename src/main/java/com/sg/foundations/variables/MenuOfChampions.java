package com.sg.foundations.variables;

public class MenuOfChampions {
    public static void main(String[] args) {
    System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n" +
            "\n" +
            "            WELCOME TO RESTAURANT NIGHT VALE!\n" +
            "            Today's Menu Is...\n" +
            "\n" +
            ".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n\n");

    String food1Name,food2Name,food3Name;
    double food1Cost, food2Cost, food3Cost;
    food1Name = "Pizza";
    food2Name = "Burger";
    food3Name = "Steak";
    food1Cost = 10.0;
    food2Cost = 13.5;
    food3Cost = 16.5;

    System.out.println("$ " + food1Cost + "****" + food1Name);
    System.out.println("$ " + food2Cost + "****" + food2Name);
    System.out.println("$ " + food3Cost + "****" + food3Name);
    }
}
