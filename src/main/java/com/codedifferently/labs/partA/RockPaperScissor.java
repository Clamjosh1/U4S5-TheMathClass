package com.codedifferently.labs.partA;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {

        Random rand = new Random();

        int numRounds = 10;

        for (int i = 0; i < numRounds; i++) {
            int choice  = rand.nextInt(3);

            String result;
            if (choice ==0) {
                result="rock";
            } else if (choice ==1) {
                result="paper";
            } else {
                result = "scissors";
            }


            System.out.println("Round" + (i+1) + ": " + result);
        }
    }
}
