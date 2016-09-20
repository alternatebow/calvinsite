public class SecondEntryWayList implements EntryWayListInterface { 

	private AList<T> aList;
	private AList<T> internalList;

	public SecondEntryWayList() {
		this.internalList = new AList();
	}
    /**
     * Inserts an element to the beginging of the list.
     * 
     * @param newEntry
     *            A parameter of generic type T that is the element to be
     *            passed.
     * @return Returns a boolean value true or false if the insertion was
     *         successful or unable to respectively.
     */
    public boolean insertHead(T newEntry){
    	if (aList.isFull()) {
    		return false;
    		
		else{
			aList.add(1, newEntry);
			return false;
		}
    }

    /**
     * Inserts an element to the end of the list.
     * 
     * @param newEntry
     *            A parameter of generic type T that is to be passed.
     * @return Returns a true if element has successfully been added to end of
     *         the list. Else it returns false.
     */
    public boolean insertTail(T newEntry){
    	if(aList.isFull()){
    		return false;
    	}
    	else{
    		aList.add(aList.getLength+1,new Entry)
    		return true;
    	}
    }

    /**
     * Deletes the item at the beginning of the list and then returns that item.
     * 
     * @return Returns the item that was just removed from the list.
     */
    public T deleteHead(){
    	if(aList.empty()){
    	 return null;
    	}else{
    	return aList.remove(1);
    	}
    }

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
     * Checks to see if the list contains equal to the entry, and return true. False otherwise.
     * 
     * @param anEntry
     *            Generic parameter that the methods checks for within the list.
     * @return true if list contains an entry equal to what's passed in.
     */
    public boolean contains(T anEntry);

    /**
     *  Tests whether list is empty
     * @return true if empty
     */
    public boolean isEmpty(){

    }

    /**
     * Determines whether list is full.
     * @return true if full
     */
    public boolean isFull();
