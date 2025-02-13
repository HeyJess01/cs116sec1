package org.jessa;

public class Arrays {
    public static void main(String[] args) {
        int [] myArray = new int[5];
        int [] myArray2 = new int[5];
        int x = 5;

        System.out.println(myArray[0]);
        myArray[0] = 134;
        System.out.println(myArray[0]);
        myArray[0] = 134 + (int) Math.PI;
        System.out.println(myArray[0]);
        System.out.println("last element is: " + myArray[myArray.length - 1]);
    }
}
