package d.collections.arrays;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
    	
        // Creating a HashMap
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 25);
        ageMap.put("Jane", 22);

        // Accessing elements
        int johnsAge = ageMap.get("John");
        System.out.println("John's age is " + johnsAge);

        // Modifying elements
        ageMap.put("John", 26);

        // Removing elements
        ageMap.remove("Jane");

        // Iterating through a map
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old");
        }

    }
}
