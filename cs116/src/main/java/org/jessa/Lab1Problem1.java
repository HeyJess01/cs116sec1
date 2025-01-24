package org.jessa;

import java.text.DecimalFormat;

public class Lab1Problem1 {
    public static void main(String[] args) {
        double a;
        a = (Math.pow(-2,2)); // First half of equation, -2^2
        a = (a * ((Math.pow(Math.E,0)+Math.log10(Math.sin(Math.PI/2.0)))/(Math.pow(3,Math.log10(1.0)))));
//        Second half of equation to the right ^
        if (a < 0){
            a = -a;
        }
//        Acts in place of the absolute value, always produces a positive number (even though a is always positive)
//        Mostly redundant but it's in the equation so it would be best to include it
        DecimalFormat decForm = new DecimalFormat("#.####");
        System.out.println("The value of a is " + decForm.format(a));
    }
}
