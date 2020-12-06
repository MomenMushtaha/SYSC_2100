------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:CountSubString
VERSION or DATE: Feb 16, 2020
AUTHORS: Mo'men Mushtaha
PURPOSE OF PROJECT:
We will assume that a string is implemented as a List of characters. Write a program that prompts the user for a
file name and opens that text file. Example text files to be used as input are provided on cuLearn (two books, one
the English translation of Victor Hugo’s Les Miserables, the other Charles Dickens’ A Tale of Two Cities). You
can also download other large text files from repositories such as Project Gutenberg (www.gutenberg.org). Then
also prompt the user for a string A. Read in the text file string by string and determine whether each string in that
text file contains your input string A as a substring. Count how often this is the case and display that number at
the end. Also measure the time that elapsed to process the complete file and display this as well.
To show the difference between the various list implementations of the ADT List provided in the Java
Collections Framework (ArrayList and LinkedList), repeat the task, the first time representing all strings
as an ArrayList and the second time as a LinkedList. Substring matching is a surprisingly complex
problem (when striving for efficiency), we may revisit this later once we introduced more ADTs. For the time
being, use the following brute-force substring matching algorithm (it is okay if in your solution you do not declare
findBrute() to be static). 
/*
 * Returns the lowest index at which substring pattern begins in text (or
 * else -1).
 */
private static int findBrute(List<Character> text, List<Character> pattern) {
 int n = text.size();
 int m = pattern.size();
 for (int i = 0; i <= n - m; i++) { // try every starting index
 // within text
 int k = 0; // k is index into pattern
 while (k < m && text.get(i + k) == pattern.get(k))
 // kth character of pattern matches
 k++;
 if (k == m) // if we reach the end of the pattern,
 return i; // substring text[i..i+m-1] is a match
 }
 return -1; // search failed
}
Your program should produce output similar to the one shown below (using Les Miserable as input file and
Javert as substring). Obviously the timing is hardware-dependent and may well differ on different computers
and implementations. To not bias your expectations, I’ve xxx-ed out the values, your final solution should provide 
some actual measurement here… ☺. The counts though should be the same across all platforms and
implementations.
Please enter the path for the input file: LesMis.txt
Enter the pattern to look for: Javert
Using ArrayLists: 457 matches, derived in xxx.x milliseconds.
Using LinkedLists: 457 matches, derived in xxx.x milliseconds. 
