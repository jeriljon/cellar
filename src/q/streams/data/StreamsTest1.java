package q.streams.data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a list of integers {1, 2, 2, 3, 3, 3, 4, 5, 5, 6}
 * Write a function to get the integer with the second most frequency
 * 
 */
public class StreamsTest1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
		int secondFrequentInt = findSecondMostFrequent(numbers);
		System.out.println("Second Most Frequent Number: " + secondFrequentInt);

	}
	
	public static Integer findSecondMostFrequent(List<Integer> numbers) {
		
		// Create a frequency map like {1=1, 2=2, 3=3, 4=1, 5=2, 6=1}
		Map<Integer, Long> frequencyMap = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("FrequencyMap: " + frequencyMap);
		
		// Convert frequencyMap to a list of entries sorted by frequency in descending order
		List<Map.Entry<Integer, Long>> sortedByFrequency = frequencyMap.entrySet().stream()
															.sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
															.collect(Collectors.toList());
		System.out.println("Sorted By Frequency List: " + sortedByFrequency);
		
		// Check if there's at least two distinct elements
		if (sortedByFrequency.size() < 2) {
			return null;
		}
		
		return sortedByFrequency.get(1).getKey();
	}

}
