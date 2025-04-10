package org.example;

import java.util.Random;

public class SwitchPlayer extends Player implements PlayerInterface{
    Random rand = new Random();

    @Override
    public int selectDoor() {
        super.selectedDoor = rand.nextInt(1,4);
        return super.selectedDoor;
    }

    @Override
    public int selectDoorAgain(int openDoor) {
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
    }
}
