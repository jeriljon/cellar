package y.datastructures.algorithms;

/**
 * Problem:
 * Given an array of integers, find the second largest element in the array.
 *
 * For example:
 * Input: [12, 35, 1, 10, 34, 1]
 * Output: 34
 *
 * Input: [10, 5, 10]
 * Output: 5
 *
 * Input: [10, 10, 10]
 * Output: No second largest element
 *
 * Solution:
 * Initialize two variables to keep track of the largest and the second largest elements.
 * Traverse the array to update these two variables accordingly.
 * Initialization:
 * first is initialized to the smallest possible integer value to ensure any number in the array will be larger.
 * second is also initialized to the smallest possible integer value.
 * Traversal:
 * Iterate through each element of the array.
 * If the current element is greater than first, update second to be the current first, and then update first to be the current element.
 * If the current element is greater than second and less than first, update second.
 * Result:
 * After traversing the array, if second is still the smallest possible integer value, it means there was no second largest element.
 * Otherwise, second contains the second largest element in the array.
 * This solution ensures that the array is traversed only once, making it an O(n) solution, which is efficient for this problem.
 *
 *
 */
public class ArraysProblem1 {

    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {10, 10, 10};

        System.out.println("Second largest in arr1: " + findSecondLargestElement(arr1));
        System.out.println("Second largest in arr2: " + findSecondLargestElement(arr2));
        System.out.println("Second largest in arr3: " + findSecondLargestElement(arr3));
    }

    public static int findSecondLargestElement(int[] numbers) {
        if (numbers.length < 2) {
            return 0;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            return 0;
        } else {
            return second;
        }

    }

}
