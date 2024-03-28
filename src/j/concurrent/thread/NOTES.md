# Objective

+ Processing Collections using Parallel Streams
+ Create and execute Threads: using Runnable & Callable
+ Manage Thread life cycle using automations using different Executor Services and Concurrent API

+ Parallel Streams
A parallel stream operates just like a regular stream, except it splits its elements into multiple chunks, processing them in parallel.
When you invoke the .parallelStream() method on a collection, the Java runtime divides the collection into several smaller chunks, assigning each to a thread in the Java ForkJoinPool (which is essentially a pool of worker threads). 
The ForkJoinPool's size typically corresponds to the number of processors available to the Java virtual machine.

+ Create and Execute Threads
Runnable and Thread

A physical computer has a CPU that executes code
	# The code for a program has a well-known entry point
		public static void main(String [] args)
	# the programming languages used will take programmer defined variables stored them in physical memory

In Java, a thread objects represents a kind of "virtual CPU"
	# program and data(a task) are assigned to this virtual CPU as an instance of java.lang.Runnable
	# real CPUs will make progress on the task at intervals, sharing their time with other threads, usually 
controlled by the OS

Runnable object provided to the Thread object
	# represents the task to be performed
	# provides entry startup point of that task in the method
		public void run()
	# This method takes zero arguments, returns void and throws no checked exceptions
	# can provide input data to the task in its member fields
	# can provide output data either as changes in member fields, or changes in members of other objects to which 
	the Runnable has a reference
	
The association of a Thread with a Runnable can be arranged by composition or by inheritance. 
	# Composition is generally preferred
	Runnable r = () -> {System.out.println("Task running)}
	Thread t = new Thread(r)
	
	# Inheritance is valid. Thread implements Runnable
	public class MyTask extends Thread {
		@Override
		public void run() {
			System.out.println("Task running");
		}
	}
	
	Thread class provides several useful methods
	# Set the thread running by calling start() method
		- A thread dies on exit from the run() at which it started
	# Wait for the thread to die by calling the join() method
	# Request the thread to shut itself down by calling interrupt()
		- Note that a thread must be coded to respond to this
		- Thread discovers using Thread.interrupted() or catching an InterruptedException
	Never kill a thread from outside. Methods stop(), suspend(), resume() are deprecated. 
	
	Every thread has a name
	# Thread.currentThread() finds the thread that is currently executing
	# aThread.getName() - returns the name of this thread
	# Default names are typically Thread-0, Thread-1 etc
	# Specify the name with a String argument when constructing the thread
	
	Relative Timing of Thread Execution
	# Unless code is written to create timing relationships between any two threads, the 
	execution of those 2 threads proceeds at a rate that is neither predictable, nor 
	repeatable between runs, so the operations, including output, of such threads interleave
	unpredictably. 
	
	JVM Exit
	The JVM exits when there are zero non-daemon threads left alive
	# A daemon thread is considered unimportant by itself
		- but if it dies while still doing work, is that good ?
	# Termination of main method is not significant
	# A thread can be made daemon by calling setDaemon(true) before starting the thread
	
	Executor Service and Future
	
	Reusing Threads
	At the OS level, threads tend to be expensive to create, and there is no reason they have 
	to die after executing a single task. 
	
	# The concept of a thread pool allows a modest number of threads to work on a very large 
	number of short-lived tasks over a long period. 
	# Tasks are submitted to a queue
	# When a worker thread completes a previous task, it pulls the next available task from the queue
	
	The core APIs provide Executor and ExecutorService implementations for this purpose
	
	The Executor and ExecutorService
	The most basic thread pool interface is the Executor which declares a single method.
	# void execute(Runnable r)
	
	The sub-interface ExecutorService is more capable. It allows: 
	# returning a result to the job submitter
	# determining status of the job
	# canceling a job
	
	To provide these capabilities, the ExecutorService API uses more types beyond the basic Runnable
	
	The ExecutorService API: 
	A key feature of this thread pool is that the task can return a value
	
	# The task is described as a Callable<R>
	public interface Callable<R> {
		R call() throws Exception;
	}	
	
	# To request execution invoke the submit method
	Callable<String> cs = () -> {return "Hello"};
	var handle = executorService.submit(cs);
	
	# This returns a handle on the task as a Future<R>
		- isDone(), isCancelled(), cancel(boolean), get(), get(long timeout, Timeout unit)
	
	Accessing the result
	The methods of the future give access to the status and result of the task
	
	# get will block until the task completes and then either
		- return tasks result
		- throw an ExecutionException with a cause that is an exception thrown by the task
		- throw an InterruptedException, which indicates the thread calling get received an interrupt
		- throw a CancellationException, which indicates that the task had already been canceled
		
	Determining the Task has Completed
	Code probably should not block waiting for the task to complete
	# isDone will return true if the task has completed
	# assuming isDone returned true, a subsequent call to get will promptly either
		- return the tasks result
		- throw an ExecutionException with a cause that is the exception that was thrown by the task
		- throw an InterruptedException if the thread calling get receives an interrupt
		- throw a CancellationException if the task had already been canceled
	
	Canceling a task
	The future object allows canceling a task
	# If the task has not started, it is dropped from the queue
	# If the task is running, the boolean argument to cancel indicates if an interrupt should be sent
	# The task is not "killed", the effect of the interrupt is up to that tasks programming
	# After cancellation, calling get will immediately throw a CancallationException
		- even if the task is still running 
		
	Keeping Track of a Runnable
	ExecutorService also allows keeping track of a task represented using a Runnable
	# Future<?> submit(Runnable r)
	# Future<?> submit(Runnable r, T result)
	In these cases, the future can poll for completion.
	In the first case, calling future's get method will return null, if the task completed normally
	In the second case, future's get method returns the result argument. 
	
	Invoking Many Tasks at Once 
	ExecutorService provides methods that start multiple tasks coded as callables
	List<Future<T>> invokeAll( ??? )
	# submits a collection of callables and returns all the futures
	T invokeAny( ??? )
	# submits a collection of callables and returns the value created by one of them
	Both of these wait for tasks to complete, and both have an overload that takes a timeout
	
	Question: 
	What are the five possible immediate outcomes of calling the get method of a Future, and 
	what situation gives rise to each ?
	Answer: 
	1. The calling thread blocks because the task is unfinished
	2. The value produced by the task is returned
	3. An ExecutionException is thrown with a cause that is an exception that was thrown from the task
	4. An InterruptedException is thrown if the thread calling get was itself interrupted
	5. A CancellationException is thrown if the task is canceled
		
	When working with concurrency in Java, particularly with the Future interface, calling the get() 	method on a Future object can lead to one of five possible immediate outcomes. These outcomes depend 	on the state of the task executed by the thread and the environment in which it is executed. Here are 	the five possible outcomes:
	
	1. Successful Completion
	Outcome: The task completes successfully, and get() returns the result of the task.
	Situation: This occurs when the task executed in a separate thread completes its execution without 	any exceptions or interruptions. The result can be any value returned by the task or null if the task 	was a Runnable (or a Callable<Void>).
	
	2. CancellationException
	Outcome: If the future was cancelled before it completed, get() throws a CancellationException.
	Situation: This happens if the cancel() method was called on the Future before the task had a 
	chance 	to complete. The cancellation may or may not be successful, depending on whether the 
	task had already started or finished executing.
	
	3. InterruptedException
	Outcome: The thread calling get() is interrupted while waiting, and get() throws an 	InterruptedException.
	Situation: This occurs if the thread that called the get() method on the Future is interrupted 
	while 	it's waiting for the result. It's a way to signal the waiting thread that it should 
	stop waiting and 	handle the interruption, typically by cleaning up resources and terminating.
	
	4. ExecutionException
	Outcome: If the task threw an exception during its execution, get() wraps that exception in an 	ExecutionException and throws it.
	Situation: This happens when the task executed by the thread throws any exception. The original 	exception is not thrown directly by the get() method but is instead wrapped in an ExecutionException. 	The caller can retrieve the original exception by calling getCause() on the ExecutionException.
	
	5. TimeoutException
	Outcome: If a timeout was specified by calling get(long timeout, TimeUnit unit) and the timeout 	period expires before the task is completed, get() throws a TimeoutException.
	Situation: This occurs when the caller wants to wait for the task's result only for a certain amount 	of time. If the task does not complete within that timeframe, the Future gives up on waiting and 	throws a TimeoutException, allowing the calling thread to proceed with other operations or handle the 	timeout accordingly.
	
	These outcomes provide a comprehensive mechanism for handling different scenarios in concurrent 	programming, allowing developers to manage task execution, handle exceptions, implement timeouts, and 	react to task cancellations effectively.
	
	
	Question: 
	What are the three methods allowing sending a Runnable to an ExecutorService for execution ?
	Answer: 
	Future<?> submit(Runnable r)
	Future<?> submit(Runnable r, T result)
	void execute(Runnable r)
	
	Question: 
	What is the signature of the method declared by Callable, and how is this related to get 
	method of Future ?
	Answer: 
	Callable<T> {T call() throws Exception;}
	The get() method returns the type T
	
	
	ExecutorService Lifecycle - Part 1
	
	Several implementations of ExecutorService are available
	# The Executors class has factories
		- newFixedThreadPool
		- newSingleThreadExecutor
		- newCachedThreadPool
		- newScheduledThreadPool
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

