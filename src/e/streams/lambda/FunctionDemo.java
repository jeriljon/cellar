package e.streams.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The Function interface in Java 8 is a part of the java.util.function package, 
 * which includes several functional interfaces aimed at providing target types for 
 * lambda expressions and method references. 
 * Function interface is designed for operations or transformations that take a single input and produce a result.
 * Function interface is useful when working with streams, operations that involve transformations from one type to another.
 */
public class FunctionDemo {

	public static void main(String[] args) {
		
		/**
		 * Example - 1
		 * Applying a Function to Convert Strings to Their Lengths
		 * In this example, String::length is a method reference that matches the Function interface. 
		 * It takes a String as input (T) and returns an Integer (R) representing the length of the string.
		 */
		List<String> words = Arrays.asList("Boston", "NewYork", "SanDiego");
		List<Integer> wordLengths = words.stream()
										.map(String::length)// using method reference
										.collect(Collectors.toList());
		System.out.println("Word Lengths: " + wordLengths);
		
		/**
		 * Example -2
		 * Composing Functions
		 * Use compose when you want to apply the given function first and then apply the current function to the result.
		 * Two functions timesTwo and squared are defined and then composed. 
		 * The compose method allows for the first function (timesTwo) to be applied, 
		 * followed by the second function (squared).
		 */
		Function<Integer, Integer> timesTwo = a -> a * 2;
		Function<Integer, Integer> squared = a -> a * a;
		Function<Integer, Integer> composedFunction = squared.compose(timesTwo);
		System.out.println(composedFunction.apply(4)); // Outputs: 64 ((4*2)^2)
		
		/**
		 * Example - 3
		 * Using Identity Function
		 * The identity method returns a function that always returns its input argument. 
		 * It's useful in scenarios where a pass-through operation is needed.
		 */
		Function<String, String> identityFunction = Function.identity();
		System.out.println(identityFunction.apply("Java"));
		
		/**
		 * Example - 4
		 * Transforming Strings using andThen
		 * In this case, Convert each string to uppercase andThen add an exclamation mark to the end.
		 */
		
		List<String> names = Arrays.asList("John", "Bobby", "Abraham", "Zach");
		Function<String, String> toUpperCase = String::toUpperCase;
		Function<String, String> addExclamation = s -> s + "!";
		Function<String, String> transform = toUpperCase.andThen(addExclamation);
		List<String> transformedNames = names.stream()
                .map(transform)
                .collect(Collectors.toList());
		System.out.println(transformedNames);
		
		/**
		 * Example - 5
		 * Numerical Transformation using andThen
		 */
		
		Function<Integer, Integer> addTwo = a -> a + 2;
		Function<Integer, Integer> minusThree = a -> a - 3;
		Function<Integer, Integer> doBoth = timesTwo.andThen(minusThree); 
		Integer result = doBoth.apply(5); // (5 * 2) - 3
		System.out.println(result); // Output: 7
		
		
		
		
	}

}
