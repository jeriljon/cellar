package a.java.operators;

public class JavaOperatorsDemo {

	public static void main(String[] args) {
		
		// Postfix operators:  ++ --
		// Use Post fix operators anytime you need to use a variable's value before modifying it. 
		// The key aspect of postfix operators is that the change in the variable's value happens after its current value has been used.
		// Postfix Increment
		int a = 5;
		int b = a++;  // a becomes 6, b is 5
		System.out.println("Post Fix Increment, a: " + a);
		System.out.println("Post Fix Increment, b: " + b);
		
		// Postfix Decrement
		int c = 5;
		int d = c--;  // d is 5, c becomes 4
		System.out.println("Post Fix Decrement, c: " + c);
		System.out.println("Post Fix Decrement, d: " + d);
		
		// Prefix / Unary Operators
		// Appear before a variable and directly modify the value of the variable they precede
		// Increment (++var)
		int e = 5;
		int f = ++e; // e becomes 6, f is also 6
		System.out.println("Prefix increment, e: " + e);
		System.out.println("Prefix increment, f: " + f);
		
		// Decrement (--var)
		int g = 5;
		int h = --g; // g becomes 4, h is also 4
		System.out.println("Prefix decrement, g: " + g);
		System.out.println("Prefix decrement, h: " + h);
		
		// Unary Plus (+var): Rarely used, as it doesn't change the value.
		int i = 5;
		int j = +i; // j is 5
		System.out.println("Unary plus, i: " + i);
		System.out.println("Unary plus, j: " + j);
		
		// Unary Minus (-var): Negates the variable's value.
		int k = 5;
		int l = -k; // l is -5
		System.out.println("Unary Minus, k: " + k);
		System.out.println("Unary Minus, l: " + l);
		
		// Logical NOT (!var): Inverts the boolean value.
		boolean m = true;
		boolean n = !m; // n is false
		System.out.println("Logical NOT (!var), m: " + m);
		System.out.println("Logical NOT (!var), n: " + n);

		// Bitwise NOT (~var): Inverts all bits.
		int o = 5; // Binary: 000...0101
		int p = ~o; // b is -6, Binary: 111...1010
		System.out.println("Bitwise NOT (~var), o: " + o);
		System.out.println("Bitwise NOT (~var), p: " + p);
		
		
		



	}

}
