package main.java.org.example;

public class AnotherRecursionAlgorithm {
    public static void main(String[] args) {
        int [] a = {1,2,3};

        System.out.println("a has " + rec(a,0,a.length - 1) + " elements");
    }

    private static int rec(int[] input, int start, int end) {
        if (start == end){
            return 1;
        } else {
            return rec(input, start+1, end) + 1 ;
        }
    }
}
