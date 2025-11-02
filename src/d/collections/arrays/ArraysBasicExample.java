package d.collections.arrays;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class ArraysBasicExample {

    public static void main(String[] args) {
        // Declaring and initializing an array of integers
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        // int[] numbers = {1, 2, 3, 4, 5}; // This line simplifies and reduces
        // Creates an array of ints 1, 2, 3, 4, 5
        int[] numbers2 = IntStream.rangeClosed(1, 5).toArray();
        for (int num : numbers) {
            System.out.print(num + " ");  // Output: 1 2 3 4 5
        }
//        System.out.println("Sum of all elements in Integer array: " + Arrays.stream(numbers).sum());
//        System.out.println("Sum of all elements in Integer array: " + Arrays.stream(numbers2).sum());

//        Using IntStream.generate with limit
        Random random = new Random();

        // Generate an array of 5 random numbers from 0 to 99
        int[] randomNumbers = IntStream.generate(() -> random.nextInt(100))
                .limit(2)
                .toArray();

        for (int n : randomNumbers) {
            System.out.print(n + " ");
        }

        // Declaring and initializing an array of strings
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name: names) {
//            System.out.println("Name: " + name);
        }

        // Adding elements to an array
        // Resizing an array and adding an element
        int[] originalArray = {1, 2, 3};
        int newSize = originalArray.length + 1;
        int[] newArray = new int[newSize];
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
        newArray[newSize - 1] = 4;
        // Iterating over the array using a for loop
//        System.out.println("Iterating over All elements of the array newArray:");
        for (int i = 0; i < newArray.length; i++) {
//            System.out.println("Element at index " + i + ": " + newArray[i]);
        }

    }
}
