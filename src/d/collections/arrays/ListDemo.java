package d.collections.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Doe");

        // Accessing elements
        String firstElement = names.get(0);

        // Modifying elements
        names.set(1, "Janet");

        // Removing elements
        names.remove("Doe");

        // Iterating through a list
        for (String name : names) {
            System.out.println(name);
        }

        // Sorting a list
        Collections.sort(names);

    }
}
