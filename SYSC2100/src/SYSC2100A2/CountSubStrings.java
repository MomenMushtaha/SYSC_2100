
import java.util.*;
import java.io.*;

/**
 * 
 *
 * @ momin 
 * @ 16/02/2020
 */



public class CountSubStrings
{
  
    private String strPattern;
    private Scanner human = new Scanner(System.in);
    private long Timing;
    private String pathway;
    private int counting;
    ArrayList<Character> patternList = new ArrayList<Character>();
    ArrayList<Character> listofarray = new ArrayList<Character>();
    

public void countingPatterns(List<Character> text, List<Character> strPattern, int Index1)
    {
        long started= System.currentTimeMillis();
        findBrute(text, strPattern);
        long ended= System.currentTimeMillis();
        Timing =(ended-started);
    }
/*
     * Return the lowest index at which substring pattern begins in text (or
     * else -1).
     */
    private int findBrute(List<Character> text, List<Character> strPattern)
    {
        int n = text.size();
        int m = strPattern.size();
        for (int i = 0; i <= n - m; i=i+1) 
        { 
            // try every starting index
            // within text
            int k = 0; 
            // k is index into pattern
            while (k < m && text.get(i + k) == strPattern.get(k))
            // kth character of pattern matches
                k=k+1;
            if (k == m) 
            // if we reach the end of the pattern,
                counting = counting + 1; 
                
        }
        return counting; 
        // search failed
}
public void SUBSTRING ()
{
        System.out.println("Please enter file pathway:");
        pathway = human.nextLine();
        try
{
            File read = new File(pathway);
            Scanner Scanning = new Scanner(read);
    String FirstString = "";
            FirstString = Scanning.nextLine();
            while (Scanning.hasNext()) 
{
       
         FirstString = FirstString + " \n " +  Scanning.nextLine();

            }

            char[] arrchar = FirstString.toCharArray();
            for(char ch1: arrchar)
            {
                listofarray.add(ch1);
            }
        }
catch(Exception z)
{
            System.out.println("");
        }
        System.out.println("Enter your string pattern:");
        strPattern=human.nextLine();
        try
{
            char[] chararr = strPattern.toCharArray();
            for(char ch2: chararr)
{
                patternList.add(ch2);
            }
        }
catch(Exception z)
{
            System.out.println("");
        };
        countingPatterns(listofarray,patternList,0);
        human.close();
        System.out.println("ArrayLists: "+counting+" matches, in "+Timing+" milliseconds.");

    }
}