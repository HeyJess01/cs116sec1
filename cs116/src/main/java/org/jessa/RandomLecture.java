package org.jessa;
import java.util.Random;

public class RandomLecture {
    public static void main(String[] args) {
        Random rnjesus = new Random();
        double x;
        x = 300 * rnjesus.nextDouble() - 100;
//      Multiplication stretches the range, subtraction or addition shifts the range
        System.out.println("Random double = " + x);

        int y = rnjesus.nextInt();
        System.out.println("Random int = " + y);
        int z = rnjesus.nextInt(10,30);
        System.out.println("Random int = " + z);
        int g = rnjesus.nextInt(10); // Lower bound is zero, not 10, upper bound is not included
        System.out.println("Random int = " + g);
    }
}
