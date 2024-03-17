package p.lambda.expressions;

public class LambdaDemo4 {

	public static void main(String[] args) {


		MyFunction myFunction = (text1, text2) -> System.out.println(text1 + text2);
		myFunction.apply("Hello Jeril", "How are you");
		
	}

}
