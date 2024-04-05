## Notes

A CPU, Code and Data
A physical computer has a CPU that executes code
The code for a program has a well known entry point
    public static void main(String [] args)
The programming language used will take programmer defined variables
and store them in physical memory

In Java, a Thread object represents a kind of "virtual CPU"
program and data (a task) are assigned to this virtual CPU as an instancec of 
java.lang.Runnable
real CPUs will make progress on the task at intervals, sharing their time
with other threads, usually controlled by the OS

The Runnable Object: 
The Runnable object provided to the Thread object
    represents the task to be performed
    provides the entry/starting point of that task in the method
        public void run()
    This method takes zero arguments, returns void, and throws no checked exceptions
    can provide input data to the task in its member fields
    can provide output data either as changes in member fields, 
    or changes in members of other objects to which the Runnable has a reference

Two Ways to Provide a Runnable
The association of a Thread with a Runnable can be arranged by composition or
by Inheritance
    Composition is generally preferred
    Runnable r = () -> { System.out.println("Task running");};
    Thread t = new Thread(r)
    
    Inheritance is valid. Thread implements Runnable
    public class MyTask extends Thread {
        @Override
        public void run() {
            System.out.println("Task running");
        }
    }

Starting and Stopping a Thread
The Thread class provides several useful methods
    Set the thread running by calling start() method
        A thread dies on exit from run() at which it started
    Wait for the thread to die by calling join() method
    Request the thread shut itself down by calling interrupt()
        Note that a thread must be coded to respond to this
        The thread discovers using Thread.interrupted() or catching an 
        InterruptedException
Never pause or kill a thread from outside. Methods stop(), suspend(), resume()
are deprecated

Additional Notes: 
In Java, the Thread class provides several methods to manage and control 
the execution of threads. Understanding the differences between 
start(), run(), join(), and interrupt() is crucial for effective multithreading. 
Here's an overview of each method and its role in Java 17, 
which remains consistent with their definitions in earlier versions of Java.

start()
Usage: Used to start a new thread of execution; the Java Virtual Machine calls 
the run() method of this thread.
Behavior: When start() is called, the system allocates resources for the thread 
and executes its run() method in parallel with the main thread and any 
other threads.
Key Point: You must call start() rather than run() to execute 
code in a new thread. Calling run() directly merely executes the 
method in the current thread without starting a new thread.

run()
Usage: Defines the code that constitutes a new thread's task or job.
Behavior: The run() method is called by the JVM internally after a thread is 
started using the start() method. 
It can also be called directly like any other method, but then it's just a 
normal method call and doesn't start a new thread.
Key Point: The run() method can be overridden when creating instances 
of Thread or implementing the Runnable interface to specify the 
action of the thread.

join()
Usage: Waits for the thread on which it is called to terminate.
Behavior: The join() method is used when a thread needs to wait for another thread to finish. When a thread calls join() on another thread, the calling thread goes into a waiting state. It remains in this state until the referenced thread terminates or the specified waiting time elapses.
Key Point: Useful for synchronizing multiple threads in applications, ensuring that a thread completes its execution before another thread proceeds.
interrupt()
Usage: Used to interrupt a thread that is in a blocked or waiting state.
Behavior: If a thread is sleeping, waiting, or otherwise occupied in a non-interruptible operation, calling interrupt() sets the thread's interrupt status. If the thread is in certain blocking operations in java.nio.channels, java.io, or Object.wait(), it throws an InterruptedException.
Key Point: Interrupting a thread does not necessarily stop it from running. The thread must support and check its interrupted status and then decide on its response to the interruption, usually by terminating or altering its behavior.
Summary
start() is called on a Thread instance to start a new thread of execution.
run() defines the task to be executed by the thread and is called by the JVM through start() or directly like any other method (without starting a new thread).
join() is used to make the calling thread wait until the specified thread ends its execution.
interrupt() is employed to interrupt a thread's execution, especially useful for threads in a waiting or sleeping state.
These methods are fundamental for managing the lifecycle and behavior of threads in Java, providing control over the concurrent execution of tasks.

The Naming of Threads
Every thread object has a name
Thread.currentThread() -- find the thread that is currently executing




