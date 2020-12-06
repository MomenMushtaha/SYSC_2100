package assignment3;
import java.util.LinkedList;
// ADT list based on the UML diagram given
class StackListBased<Q>
 {
    //Since top variable is useless in UML, it is not mentioned for better overall experience and performance 
    private LinkedList<Q> items;
    
    /**
     * Constructor for StackListBased
     * Create instances of item to a new LinkList
     */
    StackListBased() 
    {
        items = new LinkedList<>();
    }
    // Operations required 
    /**
     * Sort of useless 
     * Mentioned because it is required in the UML diagram
     */
    void createStack() //First
    {
        items = new LinkedList<>();
    }
    /**
     * Gets rid of (pop) all item(s) from items
     */
    void popAll() //Second
    {
        items.clear();
    }
    /**
     *Check if items is empty
     *Return true if it is empty
     */
    boolean isEmpty() //Third 
    {
        return items.isEmpty();
    }
    /**
     * Pushes(add) a new item(Object) to items at index 0
     */
    void push(Q Object) //Fourth 
    {
        items.add(0, Object);
    }
    /**
     * Return the top(peek) item from items and removes it
     */
    Q pop() //Fifth
    {
        return items.pop();
    }
    /**
     * Return the top(peek) item in items
     */
    Q peek() //Sixth
    {
        return items.peek();
    }
}