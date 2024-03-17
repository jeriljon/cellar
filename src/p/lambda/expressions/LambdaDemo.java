package p.lambda.expressions;

import java.util.ArrayList;
import java.util.List;

/**
 * A Java program to demonstrate Lambda expressions to implement a user defined Functional Interface
 * Functional Interface: An interface with a single abstract method
 */

public class LambdaDemo {
	
	public static void main(String [] args) {
		
		// Lambda expression to implement Functional Interface
		// This interface by default implements handleNumber
		FunctionalInterfaceExample1 example = (int x) -> System.out.println(2 * x); 
		
		example.handleNumber(5);
		example.handleString("Joe");
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		printArrayUsingLambda(list);
	}
	
	private static void printArrayUsingLambda(List<Integer> list) {
		// print all elements
		System.out.println("print all elements");
		list.forEach(n -> System.out.println(n));
		
		// print even elements 
		System.out.println("print even elements ");
		list.forEach(n -> {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		});
	}
	
	

}

interface FunctionalInterfaceExample1 {
	
	// An abstract function
	void handleNumber(int x);
	
	// A non-abstract function
	default void handleString(String y) {
		System.out.println(y);
	}
}

interface FunctionalInterfaceExample2 {
	
	int operation(int a, int b);
	
}
