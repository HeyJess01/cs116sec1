package org.example;
import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> animalsList = new ArrayList<String>();
        ArrayList<Integer> intList = new ArrayList<Integer>(5);
        // Doesn't work for primitive data types, only works for wrapped data types

        //ArrayList <FlyingDonkey>

        // Add some new elements to it
        animalsList.add("Wolverine");
        animalsList.add("Bear");
        animalsList.add("Cat");
        animalsList.add("Dog");
        animalsList.add("Fox");
        animalsList.add("Sheep");
//        Appends the array

//        Display all elements
        System.out.println(animalsList);
        animalsList.add(3, "Lion");

//       Print after add
        System.out.println(animalsList);

        animalsList.add("Squirrel");

        intList.add(54);
        intList.add(14);
        System.out.println(intList);
        intList.add(1,123);
        System.out.println(intList);

        System.out.println("Original List: " + animalsList);
        System.out.println("Original List: " + intList);

        String removedItem = animalsList.remove(3);
        System.out.println(removedItem + " removed.");
//        remove() will return the removed element.
//        although it is optional, it doesn't have to be assigned to something.
        System.out.println(animalsList + " after removal.");
//        animalsList.clear();
        System.out.println(animalsList + " after non-clear.");
        System.out.println(animalsList.toArray().length + " elements left.");

        ArrayList<String> secondAnimalsList = new ArrayList<String>(animalsList);
        System.out.println(secondAnimalsList + " Second List.");
    }
}