package g.concurrency.thread.basic;

public class RunnableBasicDemo implements Runnable {
    public void run() {
        System.out.println("Hello from a thread implemented using Runnable!");
    }

    public static void main(String[] args) {
        Runnable task = new RunnableBasicDemo();
        Thread thread = new Thread(task);
        thread.start();
    }
}

