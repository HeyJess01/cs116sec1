package org.example;

public class Car extends Vehicle{
    @Override
    public void memberOf() {
        super.memberOf();
    }
    @Override
    public void makeSound() {
        System.out.println("I am Car. I honk.");
    }
    public void move(){
        System.out.println("I am car. I drive.");
    }
}
