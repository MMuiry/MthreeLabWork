package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;
public class LazyTeenager {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean willClean = false;
        double chanceToCleanRoom = 0.1;
        while (!willClean) {
            if (chanceToCleanRoom < rand.nextDouble()) {
                System.out.println("Clean your room! (x" + (int)(chanceToCleanRoom * 10) + ")");
                chanceToCleanRoom += 0.1;
            } else if ((chanceToCleanRoom * 10) >= 7){
                System.out.println("Thats it!! your grounded!!");
                break;
            } else {
                System.out.println("Fine! I'll clean my room!");
                willClean = true;
            }

        }



    }




}
