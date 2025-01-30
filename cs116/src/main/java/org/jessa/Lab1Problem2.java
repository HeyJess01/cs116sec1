package org.jessa;

import java.util.Scanner;

public class Lab1Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many points did you earn?");
        int pointsEarned = scan.nextInt();
        System.out.println("How many credit hours did you earn?");
        int creditHoursEarned = scan.nextInt();


    }
    public static float calculateGPA(int pointsEarned, int creditHoursCompleted){
        float GPA = pointsEarned/(float)creditHoursCompleted;
        return GPA;
    }
}
