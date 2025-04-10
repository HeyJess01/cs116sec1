package org.example;

import java.util.Random;

public class RandomSwitchPlayer extends Player implements PlayerInterface {
    Random rand = new Random();
    boolean strategy;

    @Override
    public int selectDoor() {
        super.selectedDoor = rand.nextInt(1,4);
        return super.selectedDoor;
    }

    @Override
    public int selectDoorAgain(int openDoor) {
        strategy = rand.nextBoolean();
        if (strategy) {
            boolean arb = false;
            int x = rand.nextInt(1,4);
            while (!arb){
                if (x == super.selectedDoor || x == openDoor){
                    x = rand.nextInt(1,4);
                } else {
                    arb = true;
                }
            }
            super.selectedDoor = x;
            return x;
        } else {
            return super.selectedDoor;
        }
    }
}
