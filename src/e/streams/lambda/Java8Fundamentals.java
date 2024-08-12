package e.streams.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class is to look at a basic example on How Java code was written before and after Java 8
 */
public class Java8Fundamentals {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(5, "red"));
        apples.add(new Apple(6, "green"));
        apples.add(new Apple(7, "blue"));
        apples.add(new Apple(8, "red"));

        // Before Java 8
        Collections.sort(apples, new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight() - a2.getWeight();
            }
        });
        System.out.println("This is a test");
    }
}

class Apple {
    private int weight;
    private String color;

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


}
