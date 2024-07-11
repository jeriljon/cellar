package d.collections.arrays;

/**
 * Generics is a feature that allows you to create classes, interfaces, and methods that operate with generic types.
 * This enables you to write code that can work with different data types while providing compile-time type safety.
 * Below we define a generic class Box<T> with a type parameter T.
 * Class has a private field value of type T.
 * Provide a constructor to initialize the value.
 * Getter and setter methods are provided to access and modify the value.
 * Create instances of Box for different types (Integer, String, and Double) by specifying the type argument in angle brackets (<>).
 * This allows us to create instances of Box that can hold values of different types.
 *
 */
public class GenericsDemo {

	public static void main(String[] args) {
		// Create a Box for Integer
		Box<Integer> intBox = new Box<>(10);
		System.out.println("Integer value: " + intBox.getValue());

		// Create a Box for String
		Box<String> strBox = new Box<>("Hello, Java Generics!");
		System.out.println("String value: " + strBox.getValue());

		// Create a Box for Double
		Box<Double> doubleBox = new Box<>(3.14);
		System.out.println("Double value: " + doubleBox.getValue());
		

	}


}

// Generic class
class Box<T> {
	private T value;

	// Constructor
	public Box(T value) {
		this.value = value;
	}

	// Getter and setter methods
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
