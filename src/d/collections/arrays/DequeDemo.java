package d.collections.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {
        // Creating an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");

        // Accessing elements
        String first = deque.getFirst();
        System.out.println("First: " + first);
        String last = deque.getLast();
        System.out.println("Last: " + last);

        // Removing elements
        deque.removeFirst();
        deque.removeLast();
        System.out.println("deque: " + deque);

    }
}
