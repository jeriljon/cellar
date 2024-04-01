package c.oop.structures;

/**
 * Static/Compile time Polymorphism is when you have methods in the same class with the same name but different parameters
 * Correct method
 */
public class StaticPolymorphismDemo {

    public static void main(String[] args) {

        MathOperations operations = new MathOperations();

        System.out.println("Adding 2 numbers: " + operations.add(5, 10));
        System.out.println("Adding 3 numbers: " + operations.add(5, 10, 15));

    }

}

class MathOperations {

    // Method to add 2 integers
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    // Overloaded method to add 3 integers
    public int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
