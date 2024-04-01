package g.concurrency.thread.basic;

public class ThreadCreate {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
        myThread.start(); // Start the thread
        
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start(); // Start the thread

	}

}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is running");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable is running");
    }
}


