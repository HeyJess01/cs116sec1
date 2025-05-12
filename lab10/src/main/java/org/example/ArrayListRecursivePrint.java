package org.example;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class ArrayListRecursivePrint {
    public static void main (String [] args){

        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 1; i < 11; i++) { // add list of numbers to intList
            intList.add(i);
        }

        System.out.println(intList.toString()); // for reference
        printArrayListBackwards(intList,intList.size() - 1); // call method

    }

    public static void printArrayListBackwards(ArrayList<Integer> toPrint, int maxIndex){
        if (maxIndex == 0) {
            System.out.println(toPrint.getFirst()); // base case
        } else { // general case
            System.out.println(toPrint.get(maxIndex));
            printArrayListBackwards(toPrint,maxIndex - 1);
        }

    }
}

