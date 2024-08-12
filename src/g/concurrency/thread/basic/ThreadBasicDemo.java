package g.concurrency.thread.basic;

import java.util.Locale;

public class ThreadBasicDemo extends Thread{

	 public void run() {
	        System.out.println("Hello from a thread extended from Thread!");
		 	System.out.println("Thread Group: " + getThreadGroup().toString());
		 	System.out.println("Thread Group Active Count: " + getThreadGroup().activeCount());
		 	System.out.println("Current Thread Name: " + getName());
		 	System.out.println("Current Thread Group Name: " + getThreadGroup().getName());
		 	;
	    }

	    public static void main(String[] args) {
	    	ThreadBasicDemo thread = new ThreadBasicDemo();
	        thread.start();
	    }

}
