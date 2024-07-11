package y.datastructures.algorithms;


/**
 * Problem: Remove Duplicates from a Sorted Array
 * Given a sorted array, remove the duplicates in place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array; you must do this by modifying the input array in place with O(1) extra memory.
 * Input: [0,0,1,1,1,2,2,3,3,4]
 * Output: Length = 5, Array = [0, 1, 2, 3, 4]
 * Input: [1, 1, 2]
 * Output: Length = 2, Array = [1, 2]
 * Solution:
 * To solve this problem, you can use the two-pointer technique.
 * One pointer iterates through the array, and the other keeps track of the position to place the next unique element.
 * Initialization:
 * uniqueIndex is initialized to 0, which is the position to place the next unique element.
 * Traversal:
 * Iterate through the array starting from the second element (index 1).
 * If the current element (nums[i]) is not equal to the element at uniqueIndex, it means we have found a new unique element.
 * Increment uniqueIndex and place the current element at uniqueIndex.
 * Result:
 * The function returns uniqueIndex + 1, which is the length of the array with unique elements.
 * The first uniqueIndex + 1 elements of the array are the unique elements.
 * This solution ensures that the array is traversed only once, making it an O(n) solution with O(1) extra memory usage, as required.
 *
 *
 *
 */
public class ArraysProblem2 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        // [0,0,1,1,1,2,2,3,3,4]
        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length1 = removeDuplicates(nums1);
        System.out.println("Length = " + length1);
        System.out.print("Array = ");
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {1, 1, 2};
        int length2 = removeDuplicates(nums2);
        System.out.println("Length = " + length2);
        System.out.print("Array = ");
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}

