//question 1 -> solving spook problem using this method
public class Assignment1 
{
    public static int c(int n , int k) 
        { 
            if(n == k)
                return 1;
 else if(k == 0)
     return 1;

 else if(k == 1)
     return n; 
        else if(n < k)
            return 0;
return c(n-1 , k-1) + c(n-1 , k);
        }

//question 2-> solving organizing parade using this method
 public static int P(int n)
    {
      
       if (n == 1) 
           return 2;
       else if (n == 2)
           return 3;
       
       else 
           return P(n - 1) +  P(n - 2); 
    }
 
//question 3 -> solving writeline and writeblock using this method
 public static void writeLine(char ch, int n) 
 { 
     if(n <= 0) 
     {
	System.out.println();
     }
     else 
     {
 	System.out.print(ch);
        writeLine(ch , n - 1);
     
 }
 }

    public static void writeBlock(char ch , int n , int m)
 {
     if(m > 0) 
     { 
         writeLine(ch , n);
         writeBlock(ch , n , m - 1); 
     } 
 }

//question 4 -> solving reverseDigits using this method
 public static void reverseDigits(int number)
 {
if (number >= 0)
{
       if (number < 10)
 { 
	System.out.print(number);
	   return;
       }
       else {
           System.out.print(number % 10);
           reverseDigits(number / 10);
       }
}
   }

//question 5-> solving binarysearch using this method
	public static int myBinarySearch(String []anArray, int first, int last, int value)
{
  Integer[] numbers = new Integer[anArray.length];
for(int i = 0;i < anArray.length;i++)        
{
    {
        numbers[i] = Integer.parseInt(anArray[i]);
    }
    
}
  if (last == first)
{  
    if(numbers[first] == value)
{
return first;
}
else
{
return -1;
}
}
if (last > first) 
{
            int middle = first + (last - first) / 2;  
            if (numbers[middle] == value)
{  
            return middle;  
            }  
            else if (numbers[middle] > value)
{  
            return myBinarySearch(anArray, first, middle-1, value); 
            }
else
{  
            return myBinarySearch(anArray, middle+1, last, value);
            }  
        }  
        return -1;  
    }  
public static void main(String[] args) 
    {
        //testing method 1
        System.out.println("c(3 , 2) = c(2 , 1) + c(2 , 2) ="+c(3 , 2));
        System.out.println("c(2 , 1) is  "+c(2 , 1));
        System.out.println("c(2 , 2) is ="+c(2,2));
    }
}