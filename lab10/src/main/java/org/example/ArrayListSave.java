package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSave {
    public static void main (String [] args){
        ArrayList<StudentID> idList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 3; i++) { // Repeat three times, instantiate temp variables, get data, then make temp id
            // then add temp id to idList
            String ANumber = "";
            String firstName = "";
            String lastName = "";

            System.out.println("What is the student's A Number?");
            ANumber = scan.nextLine();
            System.out.println("What is the student's first name?");
            firstName = scan.nextLine();
            System.out.println("What is the student's last name?");
            lastName = scan.nextLine();

            StudentID tempID = new StudentID(ANumber,firstName,lastName);
            idList.add(tempID);
        }

        saveArrayList(idList); // call saveArray List

    }

    public static void saveArrayList (ArrayList<StudentID> toPrint){
        /*
        DISCLAIMER: I know the output file looks kinda funny with an extra "[" and "," but it prints the information
        as expected, I honestly don't know why it does this.
        */
        try {
            File toWrite = new File("output.txt");
            if (toWrite.createNewFile()) {
                System.out.println("File created: " + toWrite.getName()); // Creates file if DNE
            } else {
                System.out.println("File already exists."); // Prints if file exists
            }
            FileWriter writer = new FileWriter("output.txt");
            writer.write((toPrint.toString())); // writes toString of toPrint to file
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred."); // if an error occurs
        }
    }
}
