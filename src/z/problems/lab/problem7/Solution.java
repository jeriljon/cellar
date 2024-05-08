package z.problems.lab.problem7;

public class Solution {
    public static int reverseInteger(int x) {
        int reversed = 0;

        while (x != 0) {
            // Get the last digit
            int digit = x % 10;
            System.out.println(" last digit: " + digit);
            // Prepare to add digit to the reversed number
            int newReversed = reversed * 10 + digit;
            System.out.println(" new reversed: " + newReversed);

            // Check for overflow/underflow
            if ((newReversed - digit) / 10 != reversed) {
                return 0; // or throw an exception, depending on how you want to handle this case
            }

            reversed = newReversed;
            x /= 10; // Drop the last digit
        }

        return reversed;
    }

    public static void main(String[] args) {
        int input = 123;
        int output = reverseInteger(input);
        System.out.println("Reversed integer of " + input + " is " + output);

//        input = -123;
//        output = reverseInteger(input);
//        System.out.println("Reversed integer of " + input + " is " + output);
//
//        input = 120;
//        output = reverseInteger(input);
//        System.out.println("Reversed integer of " + input + " is " + output);
    }
}
