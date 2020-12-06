package SYSC2100A4;
import java.util.LinkedList;
//importing LinkedList
import java.util.Queue;
//importing Queue
import java.util.Stack;
//importing Stack

/**
 * @author Momin Mushtaha
 * SYSC 2100 Assignment4 submission
 * @version 03/29/2020
 */
class Assignment4
{
    /**
     * this is a recursive implementation of the selection sort algorithm.
     * @param <T> is an array type
     * @param n represents the size of theArray
     * @param theArray is the array being sorted in here
     */
    //Q1 PART 1
    public static <T extends Comparable<? super T>> void recursiveSelectionSort ( T[] theArray, int n )
    {
        int biggestIndexPossible = n - 1;
        //Index before end of array
        for ( int thisI = n - 2; thisI >= 0; thisI = thisI - 1 )
        {
             if ( theArray[thisI].compareTo( theArray[biggestIndexPossible] ) > 0 ) 
             { 
                        biggestIndexPossible = thisI;
             }   
        }
        if ( biggestIndexPossible != n - 1 ) 
        {
            T thisT = theArray[biggestIndexPossible];
            theArray[biggestIndexPossible] = theArray[n - 1];
            theArray[n - 1] = thisT;
        }
        if( n > 2 )
        {
            recursiveSelectionSort( theArray, n - 1 );
        }
    }
    /**
     * this is a recursive implementation of the bubble sort algorithm.
     * @param <T> is an array type
     * @param n represents the size of theArray
     * @param theArray is the array being sorted in here
     */
     //Q1 PART 2
     public static <T extends Comparable<? super T>> void recursiveBubbleSort ( T[] theArray, int n )
    {
        // the identifier set as true so recursion can work
        boolean checkThis = true;
        for( int thisIndex = n - 1; thisIndex > 0; thisIndex = thisIndex - 1 )
        {
            if( theArray[thisIndex].compareTo( theArray[thisIndex - 1] ) < 0 )
            //switch if the value is smaller than the one before
            {
                T thisTT = theArray[thisIndex];
                theArray[thisIndex] = theArray[thisIndex - 1];
                theArray[thisIndex - 1] = thisTT;
                checkThis = false;
            }
            if (checkThis != true) 
            { 
            //if doesnt return true then it is not sorted
            //if so it runs again
                recursiveBubbleSort(theArray, n - 1);
            }
        }
    }
    /**
     * This program implementation checks if a string is in L language.
     * L language follow the format:L={w$w’: w is a possibly empty string of characters other than $, w’ = reverse(w)}
     * the program puts(stores) the part of the string before $ in a queue as it is based on first in first out bases
     * and then puts the other part of the string after $ in a stack as it is based on a last in first out bases
     * the reason for using a queue and a stack is that the program will check if both parts have the same size and 
     * will take a letter from the stack and the queue and check if they are equivalent( the same letter )
     * if thats the case, the string is in the L language (return true if str is in L)
     */
    //Q2
    public static boolean isInLanguage ( String str ) 
    {
        Queue<Character> thisQueue = new LinkedList<>();
        Stack<Character> thisStack = new Stack<>();
        int indexThis = 0;
        //using both queue and stack
        //Base case. All chars will be in order until $. They will only need to be reversed after the $.
        while( str.charAt( indexThis ) != '$' ) 
        {
            //this is the process adding the first half of the string before $ to the Queue( thisQueue )
            thisQueue.add( str.charAt( indexThis ) ); 
            indexThis = indexThis + 1;
        }
        // going past the $ after the while loop stops
        indexThis = indexThis + 1;
        while ( indexThis < str.length() ) 
        {
            //this is the process adding the rest of the string after $ to the Stack( thisStack )
            thisStack.add( str.charAt(indexThis) );
            indexThis = indexThis + 1;
        }
        if ( thisQueue.size() == thisStack.size() ) 
        //checknig if the Queue and the Stack have the same size
        {
            for( indexThis = 0 ; indexThis < thisQueue.size() ; indexThis = indexThis + 1 ) 
            {
                // if the Head of Queue equal top of the stack -> keep looping.
                if ( thisQueue.remove() != thisStack.pop() ) 
                {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
    /**
     * it takes a string of spaces and numbers then return a number(no spaces)
     * only spaces and single digits are entered by the user
     * @param str String to convert to a number
     */
    //Q3
    public static int convertToNumber ( String str )
    {
        Queue<Integer> queueThis = new LinkedList<>();
        int thisLength = 0;
        String thisString = "";
        int thisNumber = 0;
        try{
        for( int newThisIndex = 0 ; newThisIndex < str.length() ; newThisIndex = newThisIndex + 1 )
        {
            if( str.charAt( newThisIndex ) != ' ')
            {
                queueThis.add( Character.getNumericValue( str.charAt( newThisIndex ) ) );
                thisLength = thisLength  + 1;
            }
        }
        for(int newSecondIndex = 0; newSecondIndex < thisLength ; newSecondIndex = newSecondIndex + 1 )
        {
                int queueRemoval = queueThis.remove() ;
                thisString = thisString + Integer.toString( queueRemoval ) ;
           
        }
        thisNumber = Integer.parseInt( thisString ) ;
       }
       catch( Exception e )
       {
           System.out.println( "error" );
        }
        return thisNumber;
    }
}
  