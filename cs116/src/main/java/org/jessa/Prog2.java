package org.jessa;

public class Prog2 {
    public static void main(String[] args) {
        // F = m * a
        // m = 23 kg, a = 34 m/s^2
        double massInKg = 23; //declare and initialize
        double accelMS2;
        final double K = 5;
        accelMS2 = 34; //initialize
        // double massInKg = 23, accelMS2 = 34
        double forceinN;
        forceinN = massInKg * K * accelMS2;
//        forceinN = 23 * K * 34;
//        23 and 34 are literal values, while K is not
        System.out.println(K);
//        K = 56; (unable, K is final)
        System.out.println("Force [N] = " + forceinN);
    }
}
