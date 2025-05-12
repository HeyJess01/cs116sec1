package org.example;

public class SupersonicJet extends Vehicle{
    @Override
    public void memberOf(){
        super.memberOf();
    }
    @Override
    public void makeSound(){
        System.out.println("I am Supersonic Jet. I make sonic boom");
    }
    @Override
    public void move(){
        System.out.println("I am Supersonic Jet. I fly.");
    }
}
