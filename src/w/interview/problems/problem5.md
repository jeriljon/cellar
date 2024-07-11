# Problem 5: Write a Java function and a unit test function to test it. Do not use Junit, but just java 

+ Details of the Java function.
A string S consisting of the letters A, B, C and D is given.
The string can be transformed either by removing a letter A together with an adjacent letter B,
or by removing a letter C together with an adjacent letter D.


Write a function:
class Solution { public String solution(String S); }
that, given a string S consisting of N characters, returns any string that:
can be obtained from S by repeatedly applying the described transformation, and cannot be further transformed.
If at some point there is more than one possible way to transform the string, any of the valid transformations may be chosen.
Examples:
1. Given S = "CBACD", the function may return "C", because one of the possible sequences of operations is as follows:
   The picture describes the first example test: CBACD to CBA to C.
2. Given S = "CABABD" the function may return an empty string, because one possible sequence of operations is:
   The picture describes the second example test: CABABD to CABD to

Details of the unit test function

Test the above function with a String passed in, and check if the expected value is equal to the actual returned value.
If not throw an exception.
