package org.jessa;

import java.util.Scanner;

public class StringProcessing {
    public static void main (String [] args){
        // declare input String variable and set it to an empty string
        String input = "";

        // Set up the Scanner object
        Scanner myScanner = new Scanner(System.in);

        // Prompt the user for input:
        System.out.println("Enter a line of text: ");
        input = myScanner.nextLine();
        int length = input.length();

        System.out.println("You entered: " + input);
        String inputAllLower = input.toLowerCase(); // converts string to all uppercase
        String inputAllUpper = input.toUpperCase(); // converts string to all lowercase
        System.out.println("Your input in lowercase: " + inputAllLower);
        System.out.println("Your input in UPPERCASE: " + inputAllUpper);
        String fiveLeftMost = input.substring(0,5); // assigns the first five chars to variable
        String fiveRightMost = input.substring((length - 5), length); // assigns last five chars to variable
        int indexOfCS116 = input.lastIndexOf("cs116"); // assigns the index of cs116
        String inputReplaceCS116 = input.replace("cs116","class"); // replaces "cs116" with "class" and assigns to variable
        System.out.println("Five leftmost characters in your input: " + fiveLeftMost); //[0.6 pt]
        System.out.println("Five rightmost characters in your input: " + fiveRightMost); //[1 pt]
        System.out.println("Substring 'cs116' is located at index : " + indexOfCS116); //[1 pt]
        System.out.println("Your input AFTER replacing substring 'cs116' with 'class' : " + inputReplaceCS116); //[1  pt]


        // We don't need the Scanner object anymore - close
        myScanner.close();
    }
}