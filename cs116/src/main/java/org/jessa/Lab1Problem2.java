package org.jessa;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1Problem2 {
    public static void main(String[] args) {
        boolean validValue = false;
        Scanner scan = new Scanner(System.in);
        DecimalFormat decFormat = new DecimalFormat("#.##");
        int creditHoursEarned = 0;
        int pointsEarned = 0;
        while (!validValue){
            try{
                System.out.println("How many points did you earn?");
                int input = scan.nextInt();
                if (input > 0){
                    validValue = true;
                    pointsEarned = input;

                } else {
                    System.out.println("Please input a positive integer.");
                }
            } catch (InputMismatchException exception){
                System.out.println("Please input a positive integer.");
                scan.nextLine();
            }
        }
        validValue = false;
        while (!validValue){
            try{
                System.out.println("How many credit hours did you earn?");
                int input = scan.nextInt();
                if (input > 0){
                    validValue = true;
                    creditHoursEarned = input;

                } else {
                    System.out.println("Please input a positive integer.");
                }
            } catch (InputMismatchException exception){
                System.out.println("Please input a positive integer.");
                scan.nextLine();
            }
        }
        float GPAoutput = calculateGPA(creditHoursEarned, pointsEarned);
        System.out.println("Your GPA is: " + decFormat.format(GPAoutput));

    }
    public static float calculateGPA(int pointsEarned, int creditHoursCompleted){
        float GPA = pointsEarned/(float)creditHoursCompleted;

        if ((GPA <= 4.0) && (GPA > 0)){
            return GPA;
        } else {
            System.out.println("Please try again, there has been an error.");
            return 0;
        }

    }
}
