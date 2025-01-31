package org.jessa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoanDecisionApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validValue = false;
        int annualSalary = 0;
        int yearsWorked = 0;
        boolean qualify = false;

        while (!validValue) { // Checks the data type and bounds of data entered by the user. If violated, the user is prompted to input again.
            try {
                System.out.println("What is your yearly salary?");
                int input = scan.nextInt();
                if (input > 0) {
                    validValue = true;
                    annualSalary = input;

                } else {
                    System.out.println("Please input a positive integer.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Please input a positive integer.");
                scan.nextLine();
            }

        }
        validValue = false;
        while (!validValue) { // Similar to previous block, instead assigning yearsWorked as a variable.
            try {
                System.out.println("How many years have you worked?");
                int input = scan.nextInt();
                if (input > 0) {
                    validValue = true;
                    yearsWorked = input;

                } else {
                    System.out.println("Please input a positive integer.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Please input a positive integer.");
                scan.nextLine();
            }
        }
        if (annualSalary > 60000) { // Decision point, following the flow chart given. Salary > 60000 AND yearsWorked > 3 is the only qualifying situation.
            if (yearsWorked > 3) {
                System.out.println("Qualifies.");
                qualify = true;
            } else {
                System.out.println("Does not qualify.");
            }
        } else {
            System.out.println("Does not qualify.");
            // qualify = false is omitted as it is false by default, so leaving it alone leaves it as false.
        }

    }
}
