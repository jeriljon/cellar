package d.collections.arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        // Create One-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements
        int first = numbers[0];

        // Modifying elements
        numbers[2] = 10;

        // Iterating through an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Two-dimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements in a 2D array
        int element = matrix[1][1]; // 5

    }



}
