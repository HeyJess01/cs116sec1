package org.example;

public class Vehicle implements SoundInterface, MovementInterface {
    @Override
    public void makeSound() {
        System.out.println("I am Vehicle. I make sounds");
    }
    public void memberOf(){
        System.out.println("I am a member of the Vehicle class");
    }
    @Override
    public void move(){
        System.out.println("I have a movement interface and therefore must be able to move.");
    }
}
