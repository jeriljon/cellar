package e.streams.lambda;

import java.io.IOException;
import java.io.OutputStream;

public interface MyFunction {
	
	public String apply(String text1, String text2);
	
	default public void Utf8To(String text, OutputStream outputStream) {
		try {
			outputStream.write(text.getBytes("UTF-8"));
		} catch (IOException e) {
			throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
		}
		
	}
	
	static void staticMethod(String text) {
		System.out.println(text);
	}

}
