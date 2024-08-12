### Exam topic

#### Working with Arrays and Collections
+ Create Java arrays, List, Set, Map, and Deque collections
+ Add, remove, update, retrieve and sort their elements

#### Notes:
+ Understand how to work with Java arrays and various collection types such as List, Set, Map, and Deque 

##### JAVA ARRAYS
+ Arrays are fixed-size data structures that store elements of the same type.
+ Arrays in Java are zero-indexed, meaning the first element is at index 0.
+ Arrays can be one-dimensional or multi-dimensional (e.g., two-dimensional arrays).
+ Refer ArraysDemo class
##### Possible Questions
+ How do you declare, initialize, and access elements in an array?
+ How can you iterate through a one-dimensional or two-dimensional array?
+ How do you modify elements in an array?

###### LIST COLLECTION
+ A List is an ordered collection (also known as a sequence).
+ Elements can be accessed by their integer index, and the List may contain duplicate elements.
+ Common implementations include ArrayList, LinkedList.
##### Possible Questions
+ What are the differences between ArrayList and LinkedList?
+ How do you sort elements in a List?
+ How do you access, add, remove, and update elements in a List?

###### Set Collection
+ A Set is a collection that cannot contain duplicate elements.
+ Common implementations include HashSet, LinkedHashSet, and TreeSet.
+ HashSet is unordered, while TreeSet is sorted.
##### Possible Questions
+ What is the difference between HashSet and TreeSet?
+ How does the Set interface enforce uniqueness?
+ How do you iterate through a Set?

##### Map Collection
+ A Map is an object that maps keys to values. 
+ A Map cannot contain duplicate keys, and each key can map to at most one value.
+ Common implementations include HashMap, LinkedHashMap, and TreeMap. 
##### Possible Questions
+ How do HashMap and TreeMap differ in terms of performance and ordering?
+ How do you retrieve a value based on a key in a Map?
+ How do you iterate through a Map's keys and values?

##### Deque Collection
+ A Deque (Double-Ended Queue) is a linear collection that supports element insertion and removal at both ends.
+ Common implementations include ArrayDeque and LinkedList.
##### Possible Questions
+ What are the use cases for a Deque?
+ How do ArrayDeque and LinkedList implement Deque?

  Write a Java program to demonstrate the difference between ArrayList and LinkedList in terms of performance for various operations.
  Explain how a HashSet handles duplicate elements. Write code to illustrate this.
  Create a TreeMap and demonstrate how it sorts its keys automatically.
  Implement a simple program to manage a task list using Deque. Tasks should be added and removed from both ends.