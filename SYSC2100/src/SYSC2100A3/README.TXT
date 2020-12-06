------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:InfixCalculator, LanguageRecognizerG, StackListBased 
VERSION or DATE: Mar 08, 2020
AUTHORS: Mo'men Mushtaha
PURPOSE OF PROJECT:
Design a class named LanguageRecognizerG to implement a language recognizer.
The LanguageRecognizerG class must accept strings from the user, and determine
recursively (method recursiveRecogG) whether the string is a word of the G
language.
The G language has the following grammar:
<G> = empty string | <E> | <V> <E> | <E> <G> <V>
<E> = & | #
<V> = W | A
The client program (exterior to your class) will read the word from the keyboard as
follows:
Enter the G-language word to check:
Suppose that the user enters the word:
###
The client program will then proceed to create an object of your class with the userentered word and check with one simple call of a method. The client program should not
implement any result printing at all. That is the responsibility of your class via its
methods. A client program is provided on Page 4. Feel free to use it for your tests!
The output should appear as follows:
Recursion: Word “###” is NOT a word of the G language
If the entered word is #A instead, the output would be:

Recursion: Word “#A” IS a word of the G language
CAUTION: If you take care of the printing inside recursiveRecogG you will run
into a multiple printing problem. To eliminate this, have a second method
recursivePrintG that takes care of the printing for recursion. That is the only
method that the client program will call for the language check. It then becomes the job
of recursivePrintG to make use of recursiveRecogG. 
2
2. Implement your own ADT-list-based stack class named StackListBased. Use the
ADT LinkedList of the Java Collections Framework. Your Stack implementation
should be capable of performing the operations shown in the following UML diagram.
Design another class named InfixCalculator to implement an infix calculator
using your previously implemented class StackListBased. The
InfixCalculator class must accept infix expressions from the user and evaluate
them with method evaluateInfix. This method will first convert the infix
expression to postfix expression (method convertPostfix), and then evaluate the
resulting postfix expression (method getPostfix). Use only the operators +, -, *, and
/. You can assume that the infix expression is syntactically correct and that the unary
operators are illegal. However, the infix expression should
a. allow for any type of spacing between operands, operators, and parentheses
b. allow for multi-digit integer operands
The client program (exterior to your class) will read the infix expression to evaluate from
the keyboard as follows:
Enter the infix expression to evaluate:
Suppose that the user enters the expression:
(10 + 3 * 4 / 6)
The client program will then proceed to create an object of your class with the userentered expression and evaluate it the method evaluateInfix().
The output for some example infix operations should appear as follows:
infix: (10 + 3 * 4 / 6)
postfix: 10 3 4 * 6 / +
result: 12 
3
infix: 12*3 - 4 + (18 / 6)
postfix: 12 3 * 4 - 18 6 / +
result: 35
infix: 35 - 42* 17 /2 + 10
postfix: 35 42 17 * 2 / - 10 +
result: -312
infix: 3 * (4 + 5)
postfix: 3 4 5 + *
result: 27
infix: 3 * ( 17 - (5+2))/(2+3)
postfix: 3 17 5 2 + - * 2 3 + /
result: 6 
