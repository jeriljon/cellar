package z.problems.lab.problem1;


/**
 * What is the result ?
 * Options: 
 * (A) 5
 * (B) 4
 * (C) 3
 * (D) An Exception is thrown at runtime
 * 
 */
public class Problem1 {
	
	public static void main(String [] args) {
		
		StringBuilder sb = new StringBuilder(5);
		sb.append("HOWDY");
		sb.insert(0, ' ');
		sb.replace(3, 5, "LL");
		sb.insert(6, "COW");
		sb.delete(2, 7);
		System.out.println(sb.length());
				
	}

}
