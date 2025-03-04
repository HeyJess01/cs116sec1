package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading1 {
    public static void main(String[] args){
        try {
            File inputFile = new File("dataRandom.txt");
            Scanner myScanner = new Scanner(inputFile);
            // int myInt = myScanner.nextInt();
            double myDouble = myScanner.nextDouble();
            String myString;
            double sum = 0;
            int counter = 0;
            while (myScanner.hasNextLine()) {
                myString = myScanner.nextLine();
                System.out.println(myString);
                // myDouble = Integer.parseDouble(myString);
                System.out.println("Double = " + myDouble);
                sum += myDouble;
            }
            System.out.println("Sum = " + sum);
            if (counter > 0) {
                System.out.println("Average = " + (sum / counter));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
