------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:Assignment1
VERSION or DATE: Jan 31, 2020
AUTHORS: Mo'men Mushtaha
PURPOSE OF PROJECT:
Write a Java method for the Spock problem c(n, k) seen in class. Include output code that
shows the actual sequence of calls that are made and the value that they will return when
the method is executed. For example, c(3, 2) outputs the following:
c(3,2) = c(2,1) + c(2,2)
c(2,1) = c(1,0) + c(1,1)
c(1,0) = 1
c(1,1) = 1
c(2,2) = 1
Name your method c.
Example method specification: public static int c(int n, int k)
2. Write a Java method for the problem of Organizing a Parade as presented in class. Name
your method P.
Example method specification: public static int P(int n)
3. Write a recursive Java method writeLine that writes a character repeatedly to form a line
of n characters. For example, writeLine(‘*’,5) produces the line *****.
Then write a recursive method writeBlock that uses writeLine to write m lines of n
characters each. For example, writeBlock(‘*’, 5, 3) produces the output
*****
*****
***** 
2
Example method specification: public static void writeLine(char ch, int n)
public static void writeBlock(char ch, int n, int m)
4. Write a recursive Java method that writes the digits of a positive decimal integer in
reverse order. Name your method reverseDigits.
Example method specification: public static void reverseDigits(int number)
5. Implement the recursive binary search algorithm presented in class for an array of
strings. Name your method myBinarySearch.
Example method specification: public static int myBinarySearch(String []
anArray, int first,int last, String value) 
