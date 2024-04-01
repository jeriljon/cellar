package j.concurrent.thread.basic;

public class ThreadJoinDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("Thread 1 running.");
                Thread.sleep(5000); // Simulate some work by sleeping
                System.out.println("Thread 1 completed.");
            } catch (InterruptedException e) {
                System.out.println("Thread 1 was interrupted.");
            }
        });

        Thread mainThread = Thread.currentThread();

        Thread thread2 = new Thread(() -> {
            try {
                // Simulate some processing time before interrupting the main thread
                Thread.sleep(1000);
                System.out.println("Thread 2 interrupting the main thread.");
                mainThread.interrupt(); // Interrupt the main thread which is waiting on thread1.join()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Main thread waits for thread1 to complete
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted while waiting for thread 1 to complete.");
        }
    }
}
