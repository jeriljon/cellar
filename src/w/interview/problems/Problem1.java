package w.interview.problems;

import java.util.ArrayList;

public class Problem1 {

    private ArrayList<Integer> stackList;

    // Constructor to initialize the stack
    public Problem1() {
        stackList = new ArrayList<>();
    }

    // Method to push an element onto the stack
    public void push(int x) {
        stackList.add(x);
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // or throw an exception
        }
        return stackList.remove(stackList.size() - 1);
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // or throw an exception
        }
        return stackList.get(stackList.size() - 1);
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        Problem1 stack = new Problem1();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); // Should print 30

        System.out.println("Popped element is: " + stack.pop()); // Should print 30
        System.out.println("Popped element is: " + stack.pop()); // Should print 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false

        System.out.println("Popped element is: " + stack.pop()); // Should print 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print true
    }


}
