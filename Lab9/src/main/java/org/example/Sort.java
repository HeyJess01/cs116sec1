package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {

        System.out.println("The following is a regular insertion sort");
        timeSort(1000);
        timeSort(2000);
        timeSort(4000);
        timeSort(8000);
        timeSort(16000);

        System.out.println("The following is a binary insertion sort");
        timeBisort(1000);
        timeBisort(2000);
        timeBisort(4000);
        timeBisort(8000);
        timeBisort(16000);

//
//        100 x [-10000, 10000] 1000, 2000, 4000, 8000, 16000
    }

    public static void timeSort(int arrLength){
        long startTime;
        long endTime;
        double sumTime = 0;
        int[] randints;
        Random rand = new Random();

        for (int j = 0; j < 100; j++) { // 100 trials
            randints = new int[arrLength]; // create array
            for (int k = 0; k < randints.length; k++) { // populate array
                randints[k] = rand.nextInt(-10000, 10001); // with values between -10000 and 10000 (10001 exclusive)
            }
            startTime = System.nanoTime();
            sort(randints);
            endTime = System.nanoTime();
            sumTime += endTime - startTime; // find time elapsed after sort
        }
        System.out.println("Execution time in milliseconds for arrLength " + arrLength + " : " + sumTime / 1000000);
    }

    public static void timeBisort(int arrLength){
        long startTime;
        long endTime;
        double sumTime = 0;
        int[] randints;
        Random rand = new Random();

        for (int j = 0; j < 100; j++) { // 100 trials
            randints = new int[arrLength]; // create array
            for (int k = 0; k < randints.length; k++) { // populate array
                randints[k] = rand.nextInt(-10000, 10001); // with values between -10000 and 10000 (10001 exclusive)
            }
            startTime = System.nanoTime();
            bisort(randints);
            endTime = System.nanoTime();
            sumTime += endTime - startTime; // find time elapsed after sort
        }
        System.out.println("Execution time in milliseconds for arrLength " + arrLength + " : " + sumTime / 1000000);
    }




    public static void sort(int[] arr) //insertion sort
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void bisort(int[] array){ // binary sort
        {
            for (int i = 1; i < array.length; i++)
            {
                int x = array[i];

                // Find location to insert
                // using binary search
                int j = Math.abs(
                        Arrays.binarySearch(array, 0,
                                i, x) + 1);

                // Shifting array to one
                // location right
                System.arraycopy(array, j,
                        array, j + 1, i - j);

                // Placing element at its
                // correct location
                array[j] = x;
            }
        }

    }
}
