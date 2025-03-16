package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UnsortedDataApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner fileScanner = null;
        boolean fileExists = false;
        while (!fileExists) {
            try {
                System.out.println("What is the name of the input file?");
                String fileName = sc.nextLine();
                fileScanner = new Scanner(new File(fileName));
                fileExists = true;
            } catch (FileNotFoundException e) {
                System.out.println("Sorry, that file does not exist.");
            }
        }
        double[] dataArray = new double[100];
        int u = 0;
        while (fileScanner.hasNextDouble()) {
            dataArray[u] = fileScanner.nextDouble();
            u++;
        }
        System.out.println(Arrays.toString(dataArray));

        System.out.println("Out of order before bubble: " + UnsortedData.countOutOfPosition(dataArray));
        UnsortedData.bubble(dataArray);
        System.out.println("Out of order after bubble: " + UnsortedData.countOutOfPosition(dataArray));
        System.out.println(Arrays.toString(dataArray));
    }
}
