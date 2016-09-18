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
		iList.display();
		//  *   remove the first entry
		iList.deleteHead();
		// *   remove the last entry
		iList.deleteTail();
		// *   display the list
		iList.display();
		//  *   test to see if elements are in the list (test one element that is in the list and one that is not)
		System.out.println("List contains 3? : " + iList.contains(3) );
		System.out.println("List contains 1? : " + iList.contains(1) );
		//  *   remove the last three elements in the list
		iList.deleteTail();
		iList.deleteTail();
		iList.deleteTail();
		// *   try to remove an element from the empty list
		iList.deleteTail();
		// *   display the list
		iList.display();
		// repeat for strings
		// display an empty list
		EntryWayList<String> sList = new EntryWayList<String>();
		sList.display();
		// add five entries to the list- some at the head and some at the tail
		sList.insertHead("three");
		sList.insertHead("two");
		sList.insertHead("one");
		sList.insertTail("four");
		sList.insertTail("five");
		sList.display();
		//  *   remove the first entry
		sList.deleteHead();
		// *   remove the last entry
		sList.deleteTail();
		// *   display the list
		sList.display();
		//  *   test to see if elements are in the list (test one element that is in the list and one that is not)
		System.out.println("List contains 'three'? : " + sList.contains("three") );
		System.out.println("List contains 'one'? : " + sList.contains("one") );
		//  *   remove the last three elements in the list
		sList.deleteTail();
		sList.deleteTail();
		sList.deleteTail();
		// *   try to remove an element from the empty list
		sList.deleteTail();
		// *   display the list
		sList.display();
		
	}

}
