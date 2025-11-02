package e.streams.lambda.depth;

import java.util.List;
import java.util.stream.Collectors;

public class StreamCore {

    public static void main(String[] args) {

        // Data Filtering & Selection, Extract elements matching criteria
        // Useful for querying collections based on predicates
        List<String> names = List.of("Alice", "Bob", "Anna", "Mike");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(result);

        // Data Transformation (Mapping), Convert elements from one type to another or transform values
        // getting lengths of strings
        List<Integer> lengths = names.stream()
                .map(String::length).collect(Collectors.toList());




    }
}
