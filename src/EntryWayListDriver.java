/**
 * display an empty list 
 *   add five entries to the list- some at the head and some at the tail
 *   display the list
 *   remove the first entry
 *   remove the last entry
 *   display the list
 *   test to see if elements are in the list (test one element that is in the list and one that is not)
 *   remove the last three elements in the list
 *   try to remove an element from the empty list
 *   
 * @author Karl Nicholas
 *
 */
public class EntryWayListDriver {
	// public main
	public static void main(String... args) {
		new EntryWayListDriver().run();
	}	
	// run
	private void run() {
		// display an empty list
		EntryWayList<Integer> iList = new EntryWayList<Integer>();
		iList.display();
		// add five entries to the list- some at the head and some at the tail
		iList.insertHead(3);
		iList.insertHead(2);
		iList.insertHead(1);
		iList.insertTail(4);
		iList.insertTail(5);
	}

}
