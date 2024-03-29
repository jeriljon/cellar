package q.streams.data;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 */

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig");
		
		// Filtering: Keeping only strings that start with a vowel
		List<String> vowelList = stringList.stream()
									.filter(s -> "AEIOUaeiou".indexOf(s.charAt(0)) != -1)
									.collect(Collectors.toList());
		System.out.println("Strings starting with a vowel: " + vowelList);
		
		String name = "jeril";
		System.out.println("index of : " + name.indexOf("z"));
		System.out.println("uppercase: " + name.toUpperCase());
		
		// Mapping: Convert each String to its uppercase version
		List<String> uppercaseList = stringList.stream()
										.map(String::toUpperCase)
										.collect(Collectors.toList());
		System.out.println("Strings with uppercase: " + uppercaseList);
		
		// Sorting: Sort strings in reverse alphabetical order
		List<String> reverseOrderList = stringList.stream()
										.sorted(Comparator.reverseOrder())
										.collect(Collectors.toList());
		System.out.println("Strings sorted by reverse alphabetical order: " + reverseOrderList);
		
		// Reducing: Concatenating Strings
		String concatenatedString = stringList.stream()
										.reduce("", (a, b) -> a + b + ", ");
		System.out.println("Concatenated String: " + concatenatedString);
		
		// Collecting: Group String by their first letter
		Map<Character, List<String>> groupedByFirstLetter = stringList.stream()
																.collect(Collectors.groupingBy(s -> s.charAt(0)));
		System.out.println("Grouped List by first letter: " + groupedByFirstLetter);
		
		// FlatMapping: Flatten a Stream of Lists into a Stream of Strings
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("apple", "banana"),
				Arrays.asList("cherry", "date"),
				Arrays.asList("elderberry", "fig"));
		
		List<String> flatLists = listOfLists.stream()
									.flatMap(Collection::stream)
									.collect(Collectors.toList());
		
		System.out.println("Flat Lists: " + flatLists);
		
		// Matching: Check if all, any, or none match a predicate
		boolean allMatch = stringList.stream().allMatch(s -> s.length() > 3);
		System.out.println("Do all fruits have names longer than 3 characters: " + allMatch);
		
		// Matching: Check if any fruit starts with a character
		boolean anyMatch = stringList.stream().anyMatch(s -> s.startsWith("b"));
		System.out.println("Is there any fruit that starts with b: " + anyMatch);
		
		boolean noneMatch = stringList.stream().noneMatch(s -> s.startsWith("z"));
		System.out.println("Is there no fruit that starts with z: " + noneMatch);
		
		// Numeric Streams: Demonstrating IntStream for sum, average
		IntStream intStream = IntStream.rangeClosed(1, 10);
		System.out.println("Sum of Integers 1 through 10: " + intStream.sum());
		
		IntStream intStreamForAverage = IntStream.rangeClosed(1, 10);
		OptionalDouble avg = intStreamForAverage.average();
		avg.ifPresent(s -> System.out.println("Average of Integers, 1 through 10: " + s));

	}

}
