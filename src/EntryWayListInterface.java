
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
public interface EntryWayListInterface<T> {
    /**
     * Inserts an element to the beginging of the list.
     * 
     * @param newEntry
     *            A parameter of generic type T that is the element to be
     *            passed.
     * @return Returns a boolean value true or false if the insertion was
     *         successful or unable to respectively.
     */
    public boolean insertHead(T newEntry);

    /**
     * Inserts an element to the end of the list.
     * 
     * @param newEntry
     *            A parameter of generic type T that is to be passed.
     * @return Returns a true if element has successfully been added to end of
     *         the list. Else it returns false.
     */
    public boolean insertTail(T newEntry);

    /**
     * Deletes the item at the beginning of the list and then returns that item.
     * 
     * @return Returns the item that was just removed from the list.
     */
    public T deleteHead();

    /**
     * Deletes the item at the end of the list and returns it.
     * 
     * @return Returns said item that was at the end of the list.
     */
    public T deleteTail();

    /**
     * Displays all elements currently on the list.
     */
    public void display();

    /**
     * Checks to see if the list contains the element passed in. Returns first
     * instance of element if it exists.
     * 
     * @param anEntry
     *            Generic parameter that the methods checks for within the list.
     * @return Returns the index of the element within the list. Returns a
     *         negative number if it doesn't.
     */
    public int contains(T anEntry);

    /**
     *  Tests whether list is empty
     * @return true if empty
     */
    public boolean isEmpty();

    /**
     * Determines whether list is full.
     * @return true if full
     */
    public boolean isFull();
}
