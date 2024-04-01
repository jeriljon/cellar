package j.concurrent.thread.test;

/**
 * Question: What is the result and does that change if lines n1 and n2 are tranposed
 * Answer: The result will contain both the messages, potentially in either order
 * Swapping the order of n1 and n2 guarantees that the message "Hello Threading World" is printed first !!
 */

public class ThreadTest1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			System.out.println("Hello Threading World");
		});

		t1.start();
		System.out.println("Thread Launched !");//n1
		t1.join(); // n2
		
	}

}
