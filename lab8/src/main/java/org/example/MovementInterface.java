package org.example;

public interface MovementInterface {
    default void move(){
        System.out.println("I have movement interface and therefore I have to be able to move");
    }
}
