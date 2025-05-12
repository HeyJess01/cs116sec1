package org.example;

public class Snake extends Animal{
    @Override
    public void memberOf(){
        super.memberOf();
    }
    @Override
    public void makeSound(){
        System.out.println("I am Snake. I hiss.");
    }
    @Override
    public void move(){
        System.out.println("I am snake. I slither.");
    }
}
