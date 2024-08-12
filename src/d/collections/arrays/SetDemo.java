package d.collections.arrays;

import java.util.Set;
import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        // Creating a HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate, won't be added

        // Checking if an element exists
        boolean contains = numbers.contains(20);
        System.out.println("Does Set numbers contains 20? " + contains);

        // Removing elements
//        numbers.remove(10);

        // Iterating through a set
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
