package w.interview.problems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the integer
        int i = scan.nextInt();

        // Read the double
        double d = scan.nextDouble();

        // Consume the leftover newline character
        scan.nextLine();

        // Read the string
        String s = scan.nextLine();

        // Print the values in the required format
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
