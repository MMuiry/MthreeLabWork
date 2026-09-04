package com.mthree.PracticeAssigments;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    static boolean keepPlaying = true;
    public int userWon = 0;
    public int userDraw = 0;
    public int userLost = 0;

    static int totalUserWon = 0;
    static int totalUserDraw = 0;
    static int totalUserLost = 0;

    Scanner sc = new Scanner(System.in);
    //main method that will call the other methods for their functions

    public static void main(String[] args) {
        //creating Scanner and RockPaperScissor objects.
        Scanner sc = new Scanner(System.in);
        //will keep replaying game till user says no
        int rounds;

        while (keepPlaying) {
            RockPaperScissor rps = new RockPaperScissor();
            rounds = 0;
            System.out.println("Welcome to the Rock Paper Scissor");
            //runs display method;
            mainScreen();
            //repeats to how many the rounds user wants 1-10
            rounds = rps.askUserRounds(rps);

            for (int i = 1; i <= rounds; i++) {
                //runs method that allows user to input choice
                String userChoice = rps.retrieveUserChoice(i, rounds);
                //runs method that generates ai choice
                String aiChoice = retrieveAiChoice();
                //determins whos the winner
                rps.calculateWinner(userChoice, aiChoice);
            }

            //runs methods if user wants to keep playing
            rps.displayStatPage();
            displayTotalWins();
            keepPlaying = restart(sc);
        }


    }

    private static void displayTotalWins() {
        System.out.println("Total games won: " + totalUserWon);
        System.out.println("Total games drawn: " + totalUserDraw);
        System.out.println("Total game lost: " + totalUserLost);
    }

    //will ask the user for how many rounds they want betweeen 1-10, program will end if they input incorrectly
    public int askUserRounds(RockPaperScissor rps) {
        int round;
        System.out.print("How many rounds would you like to play: (1-10)?");

        if (!sc.hasNextInt()) {
            System.out.println("This isn't an int, program exiting");
            System.exit(0);
        }

        round  = sc.nextInt();
        sc.nextLine();

        if (round < 0 || round > 10) {
            System.out.println("This isn't between 1-10");
            System.exit(0);
        }

        return round;
    }

    //retrieves and validates the user inputs for either rock, paper, scissors.
    public String retrieveUserChoice(int currentRound, int maxRounds) {
        String userChoice = null;
        boolean correctInput = false;
        System.out.print("(" + currentRound + "/" + maxRounds +  ") Please choose rock(r),paper(p),scissor(s): ");
        //validation loop

        while (!correctInput) {
            userChoice = sc.nextLine();

            if (!userChoice.equalsIgnoreCase("r") && !userChoice.equalsIgnoreCase("p") && !userChoice.equalsIgnoreCase("s")) {
                System.out.print("(" + currentRound + "/" + maxRounds +  ")Please choose rock(r),paper(p),scissor(s) (THIS NEEDS TO BE EITHER R/P/S) ");
            } else {
                correctInput = true;
            }

        }
        return userChoice;
    }

    //uses Random to generate the AI choice
    public static String retrieveAiChoice() {
        Random rnd = new Random();
        // 0-2 range
        int aiNumber = rnd.nextInt(3);
        String aiChoice;

        if (aiNumber == 0) {
            aiChoice = "Rock";
            System.out.println("" +
                    "    _______\n" +
                    "---'   ____)\n" +
                    "      (_____)\n" +
                    "      (_____)\n" +
                    "      (____)\n" +
                    "---.__(___)\n");
        } else if (aiNumber == 1) {
            aiChoice = "Paper";
            System.out.print("" +
                    "     _______\n" +
                    "---'    ____)____\n" +
                    "           ______)\n" +
                    "          _______)\n" +
                    "         _______)\n" +
                    "---.__________)\n");
        } else {
            aiChoice = "Scissor";
            System.out.println("   " +
                    " _______\n" +
                    "---'   ____)____\n" +
                    "          ______)\n" +
                    "       __________)\n" +
                    "      (____)\n" +
                    "---.__(___)\n"
            );

        }

        return aiChoice;
    }

    //greeting page
    public static void mainScreen() {
        System.out.println(
                "_______\n" +
                "---'   ____) \n" +
                "      (_____)\n" +
                "      (_____)\n" +
                "      (____)\n" +
                "---.__(___)");
    }

    //uses operations to decideds who's the winner
    public void calculateWinner(String userChoice, String aiChoice) {

        if (aiChoice.substring(0, 1).equalsIgnoreCase(userChoice)) {
            System.out.println("Almost! it was a draw! The computer picked " + aiChoice);
            userDraw++;
        }  else if (userChoice.equalsIgnoreCase("r") && aiChoice.substring(0, 1).equalsIgnoreCase("s")) {
            System.out.println("You win! The computer picked " + aiChoice);
            userWon++;
        } else if (userChoice.equalsIgnoreCase("p") && aiChoice.substring(0, 1).equalsIgnoreCase("r")) {
            System.out.println("You win! The computer picked " + aiChoice );
            userWon++;
        } else if (userChoice.equalsIgnoreCase("s") && aiChoice.substring(0, 1).equalsIgnoreCase("p")) {
            System.out.println("You win! The computer picked " + aiChoice);
            userWon++;
        } else {
            System.out.println("You lose! The computer picked " + aiChoice);
            userLost++;
        }

        System.out.println("--------------------------------------");
    }

    //Displays the overall class object
    public void displayStatPage() {
        System.out.println("Lets see how you did!");
        System.out.println("Wins - " + userWon);
        System.out.println("Lost - " + userLost);
        System.out.println("Drawed - " + userDraw);

        if (userWon > userLost) {
            System.out.println("You won the most rounds!");
            totalUserWon++;
        } else if (userWon == userLost) {
            System.out.println("It ended in a tie!");
            totalUserDraw++;
        } else {System.out.println("You lost, the computer won most rounds..."); totalUserLost++;}

    }

    //ask the user if they would like to restart the game or end the program.
    public static boolean restart(Scanner sc) {
        String keepPlayingVal;
        boolean validated = false;
        boolean playAgain = false;

        while (validated == false) {
            System.out.println("Would you like to play again? Yes/No");
            keepPlayingVal = sc.nextLine();
            if  (keepPlayingVal.equalsIgnoreCase("Yes")) {
                validated =  true;
                playAgain = true;
            } else if (keepPlayingVal.equalsIgnoreCase("No")) {
                validated = true;
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
            else {
                System.out.println("Invalid input. Try again");
            }
        }

        return playAgain;

    }
}
