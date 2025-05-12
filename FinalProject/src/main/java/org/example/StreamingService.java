package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StreamingService {
    ArrayList<User> userList = new ArrayList<>(10000);
    Scanner scan = new Scanner(System.in);
    boolean validValue;
    int check = 0;
    // ID number replaced with index no., CBA to increment an integer globally

    public StreamingService(){
        try {
            System.out.println("Main Menu\n[1] Add New User Submenu\n[2] Remove User Submenu\n[3] List All Users\n[4] User Menu\n[5] Exit");
            check = scan.nextInt();
            if ((check >= 1) && (check <= 5)){

            }

        } catch (InputMismatchException ime){
            System.out.println("Please select an option.");
            scan.nextLine();
        }

    }


}
