package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        Scanner myS = new Scanner(System.in);
        int x = 0;

        if (x != 0){
            System.out.println(2/x);
        } else {
            System.out.println("Hell no!");
        }
        int y = 890;
        try {
            System.out.println("Before nextINT.");
            System.out.println("Enter an integer value, please.");
            y = myS.nextInt();
            System.out.println("After nextINT.");
        } catch (InputMismatchException ime){
            System.out.println("Exception: " + ime);
            System.out.println(y);
        }
    }
}
