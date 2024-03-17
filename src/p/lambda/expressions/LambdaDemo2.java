package p.lambda.expressions;

/**
 * Lambda Expression with 2 arguments
 */

public class LambdaDemo2 {
		
	public static void main(String [] args) {
		
		// lambda expression for adding 2 numbers
		// data type for x and y is optional
		// This expression implements 'FunctionalInterface1' interface
		FunctionalInterface1 add = (int x, int y) -> x + y;
		
		// lambda expression for multiplying 2 numbers
		// This expression also implements 'FunctionalInterface1' interface
		FunctionalInterface1 multiply = (int x, int y) -> x * y;
		
		// Create an object of LambdaDemo2 to call operate using different implementations
		// using lambda expressions
		LambdaDemo2 demo2 = new LambdaDemo2();
		
		// Adding 2 numbers using lambda expressions
		System.out.println("Addition is : " + demo2.operate(2, 4, add));
		
		// Multiply 2 numbers using lambda expressions
		System.out.println("Multiplication is : " + demo2.operate(2, 4, multiply));
		
		// Lambda Expression for single parameter
		FunctionalInterface2 welcome = message -> System.out.println("Hello " + message);
		welcome.displayMessage("John");
	}
	
	private int operate(int a, int b, FunctionalInterface1 functionalObj) {
		return functionalObj.operation(a, b);
	}

}

interface FunctionalInterface1 {
	int operation(int a, int b);
}

interface FunctionalInterface2 {
	void displayMessage(String message);
}


