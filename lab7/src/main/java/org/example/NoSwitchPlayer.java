package org.example;

import java.util.Random;

public class NoSwitchPlayer extends Player implements PlayerInterface {
    Random rand = new Random();

    @Override
    public int selectDoor() {
        super.selectedDoor = rand.nextInt(1,4);
        return super.selectedDoor;
    }

    @Override
    public int selectDoorAgain(int openDoor) {
        return super.selectedDoor;
    }
}
