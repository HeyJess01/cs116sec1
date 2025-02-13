package org.jessa;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //outer loop
            for (int j = 1; j <= 10; j++) { //inner loop
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
