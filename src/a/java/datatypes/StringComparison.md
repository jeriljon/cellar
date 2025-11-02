# String comparison notes

+ In Java, there is an important difference between the == operator and the .equals() method when comparing two strings.
+ The == operator checks whether two object references point to the same memory location (i.e., whether they are the same object).
+ The .equals() method compares the actual content of the strings (i.e., whether the two strings have the same characters in the same order).

+ Using == with str1 and str2:
+ str1 and str2 are two separate objects created with the new keyword, even though they have the same content. Therefore, str1 == str2 will return false because they are two different objects in memory.

+ Using .equals() with str1 and str2:
+ .equals() checks the actual content of the strings, so it will return true because both strings contain the same sequence of characters ("Hello").

+ Using == with str3 and str4 (string literals):
+ String literals in Java are interned, meaning str3 and str4 refer to the same memory location. Therefore, str3 == str4 will return true because both variables point to the same object in memory.

+ Using .equals() with str3 and str4:
+ Just like before, .equals() will return true because the content of the strings is the same.

+ In Java, whether two strings with the same content are stored in the same memory location depends on how the strings are created. 
+ String Literals (String Pool):
     When you create strings as literals (e.g., String str3 = "Hello";), they are stored in a special area called the string pool. If a string with the same content already exists in the pool, the new string variable will reference the same memory location as the existing one.
+ In code, both str3 and str4 reference the same object in memory, and == will return true because they refer to the same memory location.


+ In a nutshell, == checks for memory reference equality, whereas .equals() checks for content equality.





