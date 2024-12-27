package com.codedifferently.labs.partA;

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        int numFlips = 1;

        for (int i = 0; i < numFlips; i++) {
            double chance = rand.nextDouble();

            if (chance < 0.5) {
                System.out.println("heads (" + chance + ")");
            } else {
                System.out.println("tails (" + chance + ")");
            }
        }
    }
}