package z.problems.lab;

/**
 * What is the result: 
 * Options: 
 * (A) 0 8 10
 * (B)0
 * (C) Code prints nothing
 * (D) 0 4 9
 * (E) 0 8 
 */

public class Problem2 {
	
	public static void main(String [] args) {
		printSpecificSequence();
	}
	
	private static void printSpecificSequence() {
		for (var i = 0; i < 10; i++ ) {
			switch (i % 5) {
			case 2: 
				i *= 2 * i;
				break;
			case 3:
				i++;
				break;
			case 1:
			case 4: 
				i++;
				continue;
			default: 
				break;
			} 
			System.out.println(i + " ");
			i++;
		}
	}

}
