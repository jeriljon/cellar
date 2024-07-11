package z.problems.lab;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello Jeril John");
        int sum = sumOfIntegers(1234);
        System.out.println("Sum of integers: " + sum);
    }

    // Function to get some of the integers of a number
    private static int sumOfIntegers(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


}
