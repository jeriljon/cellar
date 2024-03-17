package p.lambda.expressions;

import java.util.Comparator;

public class LambdaDemo3 {
	
	public static void main(String [] args) {
		
		// Old way of doing anonymous implementation of Comparator
		Comparator<String> stringComparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		int comparison = stringComparator.compare("hello", "world");
		System.out.println(comparison);
		
		// Lambda way of doing Comparator
		// Java 8 Type inference and thereby parameter types are omitted
		Comparator<String> stringComparatorLambda = 
				(o1, o2) -> o1.compareTo(o2);
		int lambdaComparison = stringComparatorLambda.compare("hello", "world");
		System.out.println(lambdaComparison);
	
	}
}
