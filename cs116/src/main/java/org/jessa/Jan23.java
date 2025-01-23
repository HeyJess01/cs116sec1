package org.jessa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Jan23 {
    public static void main(String[] args) {
        DecimalFormat pricePattern  = new DecimalFormat("$0.00");
        double price1 = 78.66666666666;
        System.out.println("The first price is : " + pricePattern.format(price1));

        int a;
        double d;
        //instantiate DecimalFormat object
        DecimalFormat p = new DecimalFormat("0.00000");

        //instantiate a scanner object
        Scanner myScanner = new Scanner(System.in);
        a = myScanner.nextInt();
        System.out.println("Enter a.");
        d = Math.sqrt(a);

        System.out.println("The diagonal of a square with length a = " + a + " is " + p.format(d));
    }
}
