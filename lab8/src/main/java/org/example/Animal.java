package org.example;

public class Animal implements SoundInterface, MovementInterface {
    @Override
    public void makeSound() {
        System.out.println("I am an Animal. I make sounds");
    }
    public void memberOf() {
        System.out.println("I am a member of the Animal Kingdom");
    }
    @Override
    public void move(){
        System.out.println("I have a movement interface and therefore must be able to move.");
    }
}
