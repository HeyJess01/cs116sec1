package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIterating {
    public static void main(String[] args) {
        ArrayList<String> animalsList = new ArrayList<String>();
        animalsList.add("Mammal");
        animalsList.add("Bird");
        animalsList.add("Cat");
        animalsList.add("Dog");
        animalsList.add("Pig");
        animalsList.add("Sheep");
        System.out.println("Iterating through ArrayList, enhanced for loop.");
        for (String animal : animalsList) {
            System.out.println("Element" + animal);
        }
        System.out.println("Iteration using for-each loop.");
        animalsList.forEach(System.out::println);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(31);
        intList.add(21);
        intList.add(34);
        intList.add(43);
        intList.add(35);
        intList.add(65);
        intList.add(72);
        intList.add(38);
        intList.add(49);
        System.out.println(intList);
        Collections.sort(intList);
        System.out.println(intList);

    }
}
