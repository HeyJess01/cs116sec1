package org.jessa;

public class Loops3 {
    public static void main(String[] args) {
        System.out.println("Break version");
        for (int number = 2; number <= 7; number++){
            System.out.println(number);
            if (number == 3) {
                break;
            }
        }
        System.out.println("Continue version");
        for (int number = 2; number <= 7; number++){
            if (number == 3) {
                continue;
            }
            System.out.println(number);

        }
    }
}
