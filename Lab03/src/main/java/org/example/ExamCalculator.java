package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExamCalculator {
    public static void main(String[] args) {
        boolean validValue = false;
        int examCount = 0;
        Scanner scan = new Scanner(System.in);


        while (!validValue){
            try{
                System.out.println("How many exam scores are there?");
                int input = scan.nextInt();
                if (input > 0){
                    validValue = true;
                    examCount = input;

                } else {
                    System.out.println("Please input a positive integer.");
                }
            } catch (InputMismatchException exception){
                System.out.println("Please input a positive integer.");
                scan.nextLine();
            }
        }
         validValue = false;
        float [] examScores = new float[examCount];
        float avgScore = 0;

        for (int i = 0; i < examScores.length; i++){
            while (!validValue){
                try{
                    System.out.println("Enter score #" + (i + 1) + ": ");
                    float input = scan.nextFloat();
                    if ((input >= 0) && (input <= 100)){
                        validValue = true;
                        examScores[i] = input;

                    } else {
                        System.out.println("Please input a positive floating point value no greater than 100.");
                    }
                } catch (InputMismatchException exception){
                    System.out.println("Please input a positive floating point value no greater than 100.");
                    scan.nextLine();
                }

            }
            validValue = false;
        }
        for (float examScore : examScores) {
            avgScore = avgScore + examScore;
        }

        avgScore= avgScore/examScores.length;
        int numberAboveAverage = 0;

        for (int i = 0; i < examScores.length; i++) {
            if (examScores[i] > avgScore){
                numberAboveAverage++;
            }
        }

        System.out.println("Average score is " + avgScore);
        System.out.println("There are " + numberAboveAverage + " scores larger than the average.");


    }
}