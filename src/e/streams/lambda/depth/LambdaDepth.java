package e.streams.lambda.depth;

import e.streams.lambda.MyFunction;

public class LambdaDepth {

    public static void main(String[] args) {

        // Lambda with explicit types
        // When using a custom functional interface like MyFunction with lambda expressions,
        // you don't specify parameter types inside the lambda when they are already
        // declared in the interface method.

        @FunctionalInterface
        interface MyFunction {
            int multiplyOperation(int a, int b);
        }
        @FunctionalInterface
        interface MyFunction2 {
            int addOperation(int a, int b);
        }

        MyFunction2 add = (a, b) -> a + b;
        MyFunction multiply = (a, b) -> a * b;

        System.out.println(add.addOperation(5, 3));     // Output: 8
        System.out.println(multiply.multiplyOperation(5, 3)); // Output: 15
    }
}
