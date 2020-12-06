------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:Assignment4
VERSION or DATE: Mar 29, 2020
AUTHORS: Mo'men Mushtaha
PURPOSE OF PROJECT:
1. Write recursive versions of selectionSort and bubbleSort. Call them
recursiveSelectionSort and recursiveBubbleSort respectively.
Example method specification:
public static <T extends Comparable<? super T>>
 void recursiveSelectionSort (T[] theArray, int n)
public static <T extends Comparable<? super T>>
 void recursiveBubbleSort (T[] theArray, int n)
 
2. Consider the language
L={w$w’: w is a possibly empty string of characters other than $,
 w’ = reverse(w)}
For example “abc$cba” is a string of that language. “abc$cbd” is not. Write a Java
recognition method for this language that uses both a queue and a stack. Thus, as you
traverse the input string, you insert each character of w into a queue and each character of w’
into a stack. Assume that each input string contains exactly one $. Use JCF’s
implementations of the queue and the stack. Name your method isInLanguage.
 Example method specification: public static boolean isInLanguage (String str)
 
3. When you enter characters at a keyboard, the system must retain them in the order in which
you typed them. It could use a queue for this purpose. Once the characters are in a queue, the
system can process them as necessary. For example, if you had typed an integer –without any
mistakes, but possibly preceded or followed by blanks –the queue would contain digits and 2
possibly blanks. If the digits are 2, 4, and 7, entered as “ 2 4 7” (notice the spaces all over
the place), the system should convert them into a decimal value 247.
Implement a Java method convertToNumber that uses a queue to convert a sequence of
character digits into an integer. You can assume that only spaces and single digits are entered
by the user.
Example method specification: public static int convertToNumber (String str)
