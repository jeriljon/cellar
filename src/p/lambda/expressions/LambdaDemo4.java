package p.lambda.expressions;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LambdaDemo4 {

	public static void main(String[] args) throws FileNotFoundException {

		MyFunction myFunction = (text1, text2) -> {
			System.out.println(text1 + " " + text2);
			return text1 + " + " + text2;
			};
			
		String apply = myFunction.apply("Hello Jeril", "How are you");
		System.out.println("Apply String: " + apply);
		
		MyFunction myFunction2 = myFunction;
		String apply2 = myFunction2.apply("Text 1", "Text 2");
		System.out.println("Apply2 String: " + apply2);
		
		myFunction.Utf8To("Hello Jeril, This is another test",new FileOutputStream("data.txt") );
		MyFunction.staticMethod("Jeril");
	}

}
