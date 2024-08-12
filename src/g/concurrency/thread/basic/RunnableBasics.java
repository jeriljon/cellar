package g.concurrency.thread.basic;

/**
 * Use synchronized keyword to ensure that only one thread can execute the synchronized block at a time.
 */

public class RunnableBasics implements Runnable {
    private static final Object lock = new Object();

    private String message;

    public RunnableBasics(String message) {
        this.message = message;
    }

    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + message);
                try {
                    Thread.sleep(50); // Adding sleep to simulate some work being done
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable task1 = new RunnableBasics("Hello from thread 1!");
        Runnable task2 = new RunnableBasics("Hello from thread 2!");
        Runnable task3 = new RunnableBasics("Hello from thread 3!");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
