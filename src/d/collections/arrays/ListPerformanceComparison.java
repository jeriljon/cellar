package d.collections.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Java program to demonstrate the difference between ArrayList and LinkedList in terms of performance for various operations.
 */
public class ListPerformanceComparison {
    public static void main(String[] args) {
        int numberOfElements = 100000;

        // Create ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Measure time to add elements
        long arrayListAddTime = addElements(arrayList, numberOfElements);
        long linkedListAddTime = addElements(linkedList, numberOfElements);

        System.out.println("Time taken to add " + numberOfElements + " elements:");
        System.out.println("ArrayList: " + arrayListAddTime + " ns");
        System.out.println("LinkedList: " + linkedListAddTime + " ns");

        // Measure time to access elements
        long arrayListAccessTime = accessElements(arrayList, numberOfElements);
        long linkedListAccessTime = accessElements(linkedList, numberOfElements);

        System.out.println("\nTime taken to access " + numberOfElements + " elements:");
        System.out.println("ArrayList: " + arrayListAccessTime + " ns");
        System.out.println("LinkedList: " + linkedListAccessTime + " ns");

        // Measure time to remove elements
        long arrayListRemoveTime = removeElements(arrayList);
        long linkedListRemoveTime = removeElements(linkedList);

        System.out.println("\nTime taken to remove " + numberOfElements + " elements:");
        System.out.println("ArrayList: " + arrayListRemoveTime + " ns");
        System.out.println("LinkedList: " + linkedListRemoveTime + " ns");
    }

    // Method to add elements to a list
    private static long addElements(List<Integer> list, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Method to access elements from a list
    private static long accessElements(List<Integer> list, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Method to remove elements from a list
    private static long removeElements(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(0); // Remove from the beginning
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
