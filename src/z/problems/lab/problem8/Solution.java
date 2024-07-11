package z.problems.lab.problem8;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int min = 5;
        int max = 23;
        // Output the result
        System.out.println(maxFrequencySumOfDigits(min, max));
    }

    // Function to compute the sum of the digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to find the maximum frequency of the sum of digits
    public static int maxFrequencySumOfDigits(int min, int max) {
        HashMap<Integer, Integer> sumFrequency = new HashMap<>();
        int maxFrequency = 0;

        // Iterate over the range and compute sum of digits for each number
        for (int i = min; i <= max; i++) {
            int sum = sumOfDigits(i);
            // Increment the frequency of the computed sum
            sumFrequency.put(sum, sumFrequency.getOrDefault(sum, 0) + 1);
            // Update the maximum frequency if current frequency is higher
            maxFrequency = Math.max(maxFrequency, sumFrequency.get(sum));
        }

        return maxFrequency;
    }
}
