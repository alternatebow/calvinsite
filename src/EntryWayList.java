import java.util.Arrays;

/**
 * With this kind of list, the user can only access the beginning or ending
 * elements of a list, not any elements from the middle of the list.
 * 
 * @author Karl Nicholas
 * @author Calvin Lee
 * @author Yu-Hsiang Huang(Jill)
 *
 * @param <T> generic type for list contents
 */
public class EntryWayList<T> implements EntryWayListInterface<T> {

    private T[] list; // Array of list entries; starting at list[0]
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 10000;

    public EntryWayList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public EntryWayList(int initialCapacity) {
        // Is initialCapacity too small?
        if (initialCapacity < DEFAULT_CAPACITY)
            initialCapacity = DEFAULT_CAPACITY;
        else if (initialCapacity > MAX_CAPACITY)
                throw new IllegalStateException("Attempt to create a list "
                        + "whose capacity exceeds " + "allowed maximum.");

        // The cast is safe because the new array contains null entries
        list = (T[]) new Object[initialCapacity];
        numberOfEntries = 0;
    }
    
    /**
     * Inserts an element to the beginning of the list.
     * 
     * @param newEntry
     *            A parameter of generic type T that is the element to be
     *            passed.
     * @return Returns a boolean value true or false if the insertion was
     *         successful or unable to respectively.
     */
    @Override
    public boolean insertHead(T newEntry) {
        if(numberOfEntries < MAX_CAPACITY){
            for(int i = numberOfEntries - 1; i <= 0; i--){
                this.list[i] = this.list[i + 1]; 
            }
            this.list[0] = newEntry;
            numberOfEntries++;
            return true;
            } 
            return false;
        }
        

    /**
     * Inserts an element to the end of the list.
     * 
     * @param newEntry
     *            A parameter of generic type T that is to be passed.
     * @return Returns a true if element has successfully been added to end of
     *         the list. Else it returns false.
     */
    @Override
    public boolean insertTail(T newEntry) {
        if(numberOfEntries < MAX_CAPACITY){
            this.list[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
        return false;
    }
    

    /**
     * Deletes the item at the beginning of the list and then returns that item.
     * 
     * @return Returns the item that was just removed from the list.
     */
    @Override
    public T deleteHead() {
        if(numberOfEntries > 0){
            T deletedItem = this.list[0];
            for(int i = 0; i < numberOfEntries -1; i++){
                this.list[i] = this.list[i+1]; 
            }
            numberOfEntries--;
            return deletedItem;
        }
        return null;
    }

    /**
     * Deletes the item at the end of the list and returns it.
     * 
     * @return Returns said item that was at the end of the list.
     */
    @Override
    public T deleteTail(){ 
        if(numberOfEntries > 0){
            T deletedItem = this.list[numberOfEntries - 1];
            this.list[numberOfEntries - 1] = null;
            return deletedItem;
        }
        return null;
    }

    /**
     * Displays all elements currently on the list.
     */
    @Override
    public void display() {
    	System.out.println(Arrays.toString(list));
    }

    /**
     * Checks to see if the list contains the element passed in. Returns first
     * instance of element if it exists.
     * 
     * @param anEntry
     *            Generic parameter that the methods checks for within the list.
     * @return Returns the index of the element within the list. Returns a
     *         negative number if it doesn't.
     */
    @Override
    public T contains(T anEntry) {  
        for(int i=0; i < numberOfEntries; ++i ){
            if(list[i].equals(anEntry)){
                return list[i]; 
            }
        }
        return null;
    }

    /**
     *  Tests whether list is empty
     * @return true if empty
     */
    @Override
    public boolean isEmpty() {
        if(numberOfEntries == 0){
            return true;
        }
        return false;
    }

    /**
     * Determines whether list is full.
     * @return true if full
     */
    @Override
    public boolean isFull() {
        if(numberOfEntries == MAX_CAPACITY){
            return true;
        }else{
            return false;
        }
    }
}
