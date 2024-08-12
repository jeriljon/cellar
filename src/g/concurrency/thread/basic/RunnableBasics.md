### Notes: 

+ Handle multiple threads that print out to the screen in a synchronized manner
+ Use the synchronized keyword to ensure that only one thread can execute the synchronized block at a time

##### Synchronized: 
+ The synchronized (lock) block ensures that only one thread can enter this block at a time. 
+ This prevents the threads from printing their messages simultaneously, ensuring synchronized output.

##### Lock Object:
+ A static final lock object is used as the lock for synchronization. 
+ Since it's a static member, all instances of RunnableBasicDemo share the same lock, ensuring proper synchronization across all threads.

###### Runnable Implementation: 
+ Each RunnableBasicDemo instance prints a specific message, allowing you to see which thread is running.

##### Multiple Threads: 
+ In the main method, three different Runnable tasks are created, each with its own message. 
+ Three threads are then created and started, each running one of the tasks.

###### Thread.sleep(50): 
+ This line is used to simulate some work being done by the thread and to make the thread pause for a bit, 
+ This can help you observe the synchronized behavior more clearly.