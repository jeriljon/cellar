package j.concurrent.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolingDemo {

    public static void main(String[] args) {
        // Creates a thread pool with 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submitting 10 tasks to the executor
        for (int i = 0; i < 10; i++) {
            Runnable task = new WorkerThread("" + i);
            executorService.execute(task);
        }

        // Initiates an orderly shutdown in which previously submitted tasks are executed, 
        // but no new tasks will be accepted
        executorService.shutdown();
        
        while (!executorService.isTerminated()) {
            // Wait until all tasks have finished
        }
        
        System.out.println("Finished all threads");
    }
}

class WorkerThread implements Runnable {
    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    private void processCommand() {
        try {
            // Simulate work by sleeping for a bit
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}
