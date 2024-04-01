package d.collections.arrays;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MisUseList {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList(List.<String>of(/*LocalDate.now(),*/ "Jim"));
		names.add("Fred");
//		names.add(LocalDate.of(2021, 1, 1));
		String n1 = (String)names.get(0);
//		String n2 = (String)names.get(1);
		System.out.println("n1: " + n1);
//		System.out.println("n2: " + n2);
		

	}

}
