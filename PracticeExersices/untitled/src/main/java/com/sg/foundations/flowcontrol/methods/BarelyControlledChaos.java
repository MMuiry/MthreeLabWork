package com.sg.foundations.flowcontrol.methods;

public class BarelyControlledChaos {
    public static void main(String[] args) {
        String color = chooseRndColour(); // call color method here
        String animal = chooseRndAnimal(); // call animal method again here
        String colorAgain = chooseRndColour(); // call color method again here
        int weight = chooseRndNum(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = chooseRndNum(1, 20); // call number method,
        // with a range between 10 - 20
        int number = chooseRndNum(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = chooseRndNum(2, 6); // call number method,
        // with a range between 2 - 6



        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    private static int chooseRndNum(int min, int max) {
        return  (int) (Math.random() * (max - min + 1) + min);

    }


    private static String chooseRndAnimal() {
        int rndNum = chooseRndNum(1, 5);
        String animal = null;
        if (rndNum == 1) {
            animal = "Bird";
        }  else if (rndNum == 2) {
            animal = "Cat";
        }   else if (rndNum == 3) {
            animal = "Dog";
        }    else if (rndNum == 4) {
            animal = "Pig";
        }    else if (rndNum == 5) {
            animal = "Rabbit";
        }
        return animal;
    }

    private static String chooseRndColour() {
        int rndNum = chooseRndNum(1, 5);
        String colour = null;
        if (rndNum == 1) {
            colour = "Red";
        }  else if (rndNum == 2) {
            colour = "Orange";
        }   else if (rndNum == 3) {
            colour = "Green";
        }    else if (rndNum == 4) {
            colour = "Blue";
        }    else if (rndNum == 5) {
            colour = "Purple";
        }
        return colour;

    }

}
