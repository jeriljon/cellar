package g.concurrency.thread.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *  ArrayLists are processed quite efficiently with parallel streams 
 *  because they offer fast random access to their elements, 
 *  making it easy to split the collection into sublists.
 *   
**/
public class ParallelStreamsBasicDemo {

	public static void main(String[] args) {
//		 processArrayList();
//		 processLinkedList();
		 processHashSet();

	}
	
	public static long processArrayList() {
		List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }
        long count = numbers.parallelStream().filter(num -> num % 2 == 0).count();
        System.out.println("Count of even numbers in processArrayList: " + count);
		return count;
	}
	
	public static long processLinkedList() {
		List<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }
        long count = numbers.parallelStream().filter(num -> num % 2 == 0).count();
        System.out.println("Count of even numbers in processLinkedList: " + count);
		return count;
	}
	
	public static long processHashSet() {
		Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }
        long count = numbers.parallelStream().filter(num -> num % 2 == 0).count();
        System.out.println("Count of even numbers in processHashSet: " + count);
		return count;
	}
	
}
