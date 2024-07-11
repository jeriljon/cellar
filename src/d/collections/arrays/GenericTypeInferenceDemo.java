package d.collections.arrays;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Java Generic types are associated with an expression, not with a type
 * When using generics in Java, the type parameter can be inferred based on the context in which it's used.
 * The actual type used with the generic class or method is determined by the type of the expression used to create an instance or call the method,
 * rather than explicitly specifying the type.
 * This is known as Generic Type Inference.
 * Method createList() that returns a List<String> without explicitly specifying the type parameter String.
 * The compiler infers the type based on the context in which the method is called.
 * Static method getMessage() that returns a generic type T, but the return type is inferred based on the context when the method is called in the main method.
 * Both methods demonstrate the use of generics with type inference, where the actual type used is determined by the context in which the method is called.
 * This allows for flexibility and cleaner code without the need to explicitly specify type parameters in every method call.
 *
 */
public class GenericTypeInferenceDemo {

    public static void main(String[] args) {
        // Generic type inference with ArrayList
        List<String> stringList = createList(); // Inferred type: String
        stringList.add("Hello");
        stringList.add("Java");
        stringList.add("Generics");
//        printList(stringList);

        // Generic type inference with static method
        String message = getMessage(); // Inferred type: String
//        System.out.println("Message: " + message);

        Object list = new ArrayList<String>();
//        System.out.println(list instanceof List);

        // What happens in below line ? Compilation fails
//        new ArrayList<>(List.of("")).add(LocalDate.now());

        // What happens in below code ? Execution fails, throwing a ClassCastException
        List l = new ArrayList<String>();
        l.add(LocalDate.now());
        List<String> ls = l;
//        String s = ls.get(0);
//        System.out.println(s);

        // What happens here ?
        List<String> lst = new ArrayList<>();
        if (lst instanceof ArrayList) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Generic method that returns a List of Strings
    public static List<String> createList() {
        List<String> list = new ArrayList<>();
        return list;
    }

    // Generic method that returns a String
    public static <T> T getMessage() {
        return (T) "This is a generic message";
    }

    // Method to print elements of a List
    public static void printList(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}
