package e.streams.lambda.compose;

import java.util.function.Function;

public class ComposeFunctions {

    public static void main(String[] args) {

        // Function to add 10 to a number
        Function<Integer, Integer> addTen = x -> x + 10;
        System.out.println("");

        // Function to multiple a number to 5
        Function<Integer, Integer> multiplyBy5 = x -> x * 5;

        // Create a composed function where the number will be multiplied by 5 & added by 10
        Function<Integer, Integer> composedFunction = addTen.compose(multiplyBy5);
        int result1 = composedFunction.apply(20);
        System.out.println("result1: " + result1);


    }
}
