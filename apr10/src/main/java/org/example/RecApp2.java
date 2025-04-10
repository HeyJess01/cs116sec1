package org.example;

public class RecApp2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3,4,5,6,};

        System.out.println(sum(arr,0,arr.length - 1));

    }
    public static int sum(int [] input, int start, int end) {
        int sumVar = 0;
        if (start == end) {
            return input[start];
        } else {
            sumVar = input[end] + sum(input, start, end - 1);
            // Recursively calls itself with an end one less than the previous call,
            // until the recursion reaches the base case, and the if statement applies
            // and the sum returns the base case, and the program conquers until
            // the sum sumVar is found.
        }
        return sumVar;
    }
}
