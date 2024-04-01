package g.concurrency.thread.basic;

public class ThreadBasicDemo extends Thread{

	 public void run() {
	        System.out.println("Hello from a thread extended from Thread!");
	    }

	    public static void main(String[] args) {
	    	ThreadBasicDemo thread = new ThreadBasicDemo();
	        thread.start();
	    }

}
