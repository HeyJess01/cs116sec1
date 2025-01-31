package org.jessa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2Problem4 {
    public static void main(String[] args) {
        boolean validValue = false;
        Scanner scan = new Scanner(System.in);
        int N = 0;
        double sum = 0;

        while (!validValue) { // Checks the data type and bounds of data entered by the user. If violated, the user is prompted to input again.
            try {
                System.out.println("Enter an N value.");
                int input = scan.nextInt();
                if (input > 0) {
                    validValue = true;
                    N = input;

                } else {
                    System.out.println("Please input a positive integer.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Please input a positive integer.");
                scan.nextLine();
            }

        }
        for (int i = 0; i < N; i++) {
            sum = Math.sin(Math.pow(2,(Math.PI + (i+1))));
        }
        System.out.println("The sum is: " + sum + " with N of " + N);
    }
}
