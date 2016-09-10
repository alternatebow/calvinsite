/**
 * 2. Imagine a pile of books on your desk. Each book is so large and heavy that
 * you can remove only the top one from the stack. You cannot remove a book from
 * under another one. Likewise, you can add another book to the stack only by
 * placing it on the top of the stack. You cannot add a book beneath another
 * one.
 * 
 * If you represent books by their titles alone, design a class that you can use
 * to track the books in the stack on your desk.
 * 
 * Specify each operation by stating its purpose, by describing its parameters,
 * and by writing a pseudo-code version of its header. Then write a Java
 * interface for the stack's methods. Include javadoc-style comments in your
 * code.
 * 
 * @author Karl Nicholas
 * @author Calvin Lee
 * @author Yu-Hsiang Huang(Jill)
 * 
 * @param <E> generic type for list contents
 */
public interface StackOfBooks<E> {
    /**
     * Gives the current size of the stack.
     * 
     * @return Returns the integer amount of entries in the stack.
     */
    public int sizeOfStack();

    /**
     * Removes all entries of the stack in question (current context).
     */
    public void clearStack();

    /**
     * Displays the current contents of the stack, 'oldest' entries first.
     * 
     * @return Returns a string that lists all entries within the stack.
     */
    public String stackHistory();

    /**
     * Tests if this stack is empty.
     * 
     * @return true if this stack contains no items; false otherwise.
     */
    public boolean empty();

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     * 
     * @return the object at the top of this stack
     */
    public E peek();

    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     * 
     * @return the object at the top of this stack (the last item)
     */
    public E pop();

    /**
     * Pushes an item onto the top of this stack.
     * 
     * @param item
     *            The item to be added on to the top of the stack.
     * @return the item argument
     */
    public E push(E item);

    /**
     * Returns the 1-based position where an object is on this stack.
     * 
     * @param item item to be searched for
     * @return the 1-based position from the top of the stack where the object is located
     */
    public int search(E item);

}