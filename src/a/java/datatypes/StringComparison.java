package a.java.datatypes;

public class StringComparison {

    public static void main(String[] args) {
        // Creating two String objects with the same content
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Using == operator
        if (str1 == str2) {
            System.out.println("Using '==': The strings are the same (same memory reference).");
        } else {
            System.out.println("Using '==': The strings are NOT the same (different memory reference).");
        }

        // Using .equals() method
        if (str1.equals(str2)) {
            System.out.println("Using .equals(): The strings have the same content.");
        } else {
            System.out.println("Using .equals(): The strings do NOT have the same content.");
        }

        // Example with string literals
        String str3 = "Hello";
        String str4 = "Hello";

        // Using == operator with string literals
        if (str3 == str4) {
            System.out.println("Using '==': The string literals are the same (same memory reference).");
        } else {
            System.out.println("Using '==': The string literals are NOT the same (different memory reference).");
        }

        // Using .equals() method with string literals
        if (str3.equals(str4)) {
            System.out.println("Using .equals(): The string literals have the same content.");
        } else {
            System.out.println("Using .equals(): The string literals do NOT have the same content.");
        }
    }


}
