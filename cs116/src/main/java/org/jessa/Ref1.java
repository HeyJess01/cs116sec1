package org.jessa;

public class Ref1 {
    public static void main(String[] args) {
        int [] x = new int [2];
        x[0] = 56;
        x[1] = 78;
        int [] y = x;
        System.out.println("x[0] = " + x[0]);
        System.out.println("y[0] = " + y[0]);
        y[0]++;
        System.out.println("x[0] = " + x[0]);
        System.out.println("y[0] = " + y[0]);

    }
}
