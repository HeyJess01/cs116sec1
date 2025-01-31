package org.jessa;

public class Lab2Problem3 {
    public static void main (String [] args){
        // declare an initialize array of integer values
        int [] a = {2,5,10,0,3,45,4,23,1,2,5,280,3};


        // you can change array size and elements for testing

        // call find2nd method here

        // display a message with findSecond method result here

        System.out.println("The index of the second largest number is " + (findSecond(a) + 1));
    }
    public static int findSecond(int [] inputArray){
        int secondLargest = 0;
        int firstLargest = 0;
        int indexSecondLargest = 0;

        for(int i = 0; i < inputArray.length; i++){
            if (firstLargest < inputArray[i]){
                firstLargest = inputArray[i];
            }
        }
        for(int j = 0; j < inputArray.length; j++){
            if ((secondLargest < inputArray[j]) && (secondLargest < firstLargest)) {
                secondLargest = inputArray[j];
                indexSecondLargest = j;
            }
        }

        return indexSecondLargest;
    }
}
