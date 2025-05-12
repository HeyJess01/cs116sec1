package org.example;

public class Bird extends Animal{
    @Override
    public void memberOf(){
        super.memberOf();
    }
    @Override
    public void makeSound(){
        System.out.println("I am a bird. I chirp");
    }
    @Override
    public void move(){
        System.out.println("I am bird. I fly.");
    }
}
