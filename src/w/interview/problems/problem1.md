# Problem 1

Implement a Stack using Java
+ A stack is a data structure that follows the Last-In-First-Out (LIFO) principle. 
+ Implement a stack with the following operations:
+ push(int x) - Pushes an element onto the stack.
+ pop() - Removes the element on top of the stack and returns it.
+ peek() - Returns the element on top of the stack without removing it.
+ isEmpty() - Returns whether the stack is empty.

# Solution 

Explanation:
+ Constructor: Initializes an empty ArrayList to store stack elements.
+ push(int x): Adds the element x to the end of the list, which represents the top of the stack.
+ pop(): Checks if the stack is empty. If not, it removes and returns the last element of the list, which represents the top of the stack.
+ peek(): Checks if the stack is empty. If not, it returns the last element of the list without removing it.
+ isEmpty(): Checks if the stack list is empty and returns true if it is, otherwise false.
+ main method: Tests the stack operations by pushing elements onto the stack, 
peeking at the top element, popping elements from the stack, and checking if the stack is empty.
+ This example demonstrates a basic stack implementation using an ArrayList in Java. 
+ You can run this code to see how the stack operations work in practice.

