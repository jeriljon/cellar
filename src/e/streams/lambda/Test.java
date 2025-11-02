package e.streams.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Bob", "Thomas", "Abraham");
        List<Integer> wordLengths = words.stream().map(String:: length)
                .collect(Collectors.toList());
//        System.out.println(wordLengths);

        Function<Integer, Integer> add2 = a -> a + 2;
        Function<Integer, Integer> divideBy2 = a -> a / 2;
        Function<Integer, Integer> composedFunction = divideBy2.compose(add2);
//        System.out.println("Result: " + composedFunction.apply(10));

        // Stream operations
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filteredNames); // Output: [Alice]

    }
}
