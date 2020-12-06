package assignment3;

class LanguageRecognizerG 
//recognizes whether the string passed follows the grammar of G language
{
    private String str;
    /**
     *Constructor of the LanguageRecognizer class
     * takes the string and test language G compatibility 
     */
    LanguageRecognizerG(String str) 
    {
        this.str = str;
    } 
    /**
     *boolean cases accordng to G langauge grammar 
     */
    private boolean RecogV(char str)
    {
        return (str == 'W' || str == 'A');
        //it will return if the string(str) falls under "<V>" according to G langauge grammar 
    }
    private boolean RecogE(char str)
    {
        return (str == '&' || str == '#');
        //it will return if the string(str) falls under "<E>" according to G language grammar
    }
    private boolean recursiveRecogG(String str)
    {
        switch (str.length()) 
        {
            // using switch to determine which case we are dealing with 
            case 0:
                // "empty string" - > case 0 (length = 0)
                return true;
                
            case 1:
                //"<E>" - > case 1 (length = 1)
                return RecogE(str.charAt(0));
                
            case 2:
                //"<V> <E>"  - > case 2 (length = 2)
                return ((RecogE(str.charAt(0)) && RecogV(str.charAt(1))) || (RecogV(str.charAt(0)) && RecogE(str.charAt(1))));
            
            default:
                //"<E> <G> <V>" - > defult case (length > 2)
                return (RecogE(str.charAt(0)) && recursiveRecogG(str.substring(1, str.length() - 1)) && RecogV(str.charAt(str.length() - 1)));
        
        }
    }
    /**
     *first it prompts recursiveRecogG to run and then it print the results.
     *called by Assignment3(w1) 
     */
    void recursivePrintG() 
    {
        if (recursiveRecogG(str)) //G language Grammar test positive 
        {
            System.out.println("Recursion: Word “" + str + "” IS a word of the G language");
        } 
        
        else //G language test negative 
        {
            System.out.println("Recursion: Word “" + str + "” is NOT a word of the G language");
        }
    }
}