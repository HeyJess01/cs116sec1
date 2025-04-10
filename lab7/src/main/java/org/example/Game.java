package org.example;

import java.util.Random;

public class Game {
    private int prizeLocation = 0;
    Random rand = new Random();

    Game(){
        prizeLocation = rand.nextInt(1,4);
    }

    public int getPrizeLocation() {
        return prizeLocation;
    }

    public void reset(){
        prizeLocation = rand.nextInt(1,4);
    }

    public int getOpenDoor(int initialGuess){
        boolean arb = false;
        int x = rand.nextInt(1,4);
        while (!arb){
            if ((x == initialGuess) || (x == prizeLocation)){
                x = rand.nextInt(1,4);
            } else {
                arb = true;
            }
        }
        return x;
    }
}
