package org.jessa;
import java.util.Random;

public class RandomNumbersApp {

    public static void main(String[] args) {
        int singleSixSidedDieRoll;  // you CANNOT change this line
        int singleTwelveSidedDieRoll;  // you CANNOT change this line
        int randomInt;  // you CANNOT change this line
        int lowerBound = -1;  // you CAN change values later for testing
        int upperBound = 10;  // you CAN change values later for testing
        double randomDouble;  // you CANNOT change this line

        // your code goes (method calls and assignments) here [2 pts]
        singleSixSidedDieRoll = rollSixSidedDie();
        singleTwelveSidedDieRoll = rollTwelveSidedDie();
        randomInt = generateRandomInt(lowerBound,upperBound);
        randomDouble = generateRandomDouble(lowerBound,upperBound);

        System.out.println("Six-sided die roll: " + singleSixSidedDieRoll);
        System.out.println("Twelve-sided die roll: " + singleTwelveSidedDieRoll);
        System.out.println("Random integer value from the range [" + lowerBound + ", " + upperBound + "]: " + randomInt);
        System.out.println("Random double value from the range [" + lowerBound + ", " + upperBound + "): " + randomDouble);
    }

    // your methods go here
    // sixSidedDieRoll method [0.5 pt]
    public static int rollSixSidedDie() {
        Random rand = new Random();
    return ((rand.nextInt(6))+1);
    }
    // twelveSidedDieRoll [0.5 pt]
    public static int rollTwelveSidedDie() {
        Random rand = new Random();
        return ((rand.nextInt(12))+1);
    }
    // generateRandomInt method [1 pt]
    public static int generateRandomInt(int min, int max) {
        Random rand = new Random();
        return ((rand.nextInt(max - min + 1))+min);
    }
    // generateRandomDouble method [0.5 pt]
    public static double generateRandomDouble(int min, int max) {
        Random rand = new Random();
        return (((min + (max - min) * rand.nextDouble())));
    }
}
