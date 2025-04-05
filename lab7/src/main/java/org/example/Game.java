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

    }
}
