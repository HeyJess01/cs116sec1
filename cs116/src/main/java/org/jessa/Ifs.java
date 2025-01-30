package org.jessa;

public class Ifs {
    public static void main(String[] args) {
        boolean onOffSwitch = true; // Assume this means ON

        System.out.println(onOffSwitch);
        int temperature = 71;
        int pressure = 20;
        boolean isHot = (temperature != 90);
        System.out.println(isHot);

        boolean allGood = (temperature == 90) && (pressure < 20);
        System.out.println(allGood);

        if (pressure < 20){ // Single Alternative
            System.out.println("Pressure OK");
        }
        if (pressure < 20){ // Double Alternative
            System.out.println("2. Pressure OK");
        } else {
            System.out.println("2. Pressure NOT OK");
        }
        if (pressure < 20){ // Multiple Alternative, else-if statement (pressure < 10) is redundant and should be removed.
            System.out.println("3. Pressure OK");
        } else if (pressure > 30) {
            System.out.println("3. Pressure NOT OK");
        } else {
            System.out.println("Pressure is between 20 and 30");
        }

        System.out.println("We're done here.");

        System.out.println(!true);
    }
}
