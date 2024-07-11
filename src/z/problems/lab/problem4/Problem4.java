package z.problems.lab.problem4;

/**
 * What is the result ?
 * Options: 
 * (A) 2-4
 * (B) 0-6
 *     1-5
 *     2-4
 * (C) 1-5
 * (D) 1-5
 *     2-4
 * (E) The compilation fails due to an error in Line 1
 * (F) 0-6
 * (G) 0-6
 *     2-4
 */

public class Problem4 {

	public static void main(String[] args) {
		int x = 0, y = 6;
		for (; x < y; x++, y--) {
			if (x % 2 == 0) {
				continue;
			}
			System.out.println(x + "-" + y);
		}

	}

}
