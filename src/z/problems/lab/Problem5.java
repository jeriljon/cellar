package z.problems.lab;

public class Problem5 {

	public static void main(String[] args) {
		printNumbers();
	}
	
	private static void printNumbers() {
		int i = 10;
		do {
			for (int j = 1/2; j > 0; j--) {
				System.out.println(j + " ");
			}
			i -= 2;
		} while (i < 10);
	}

}
