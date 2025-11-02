package a.java.datatypes;

public class StringIdentity {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // Using ==
        System.out.println("s1 == s2: " + (s1 == s2)); // true
        System.out.println("s1 == s3: " + (s1 == s3)); // false
        System.out.println("s3 == s4: " + (s3 == s4)); // false

        // Using .equals()
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true


    }


}
