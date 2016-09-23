public class week_5_Hw{
	public static void main(String[] args) {
		Node firstNode = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);
		Node fourNode = new Node(4);
		Node fifthNode = new Node(5);
		Node sixthNode = new Node(6);

		secondNode.setNextNode(firstNode);
		thirdNode.setNextNode(secondNode);
		fourNode.setNextNode(thirdNode);
		fifthNode.setNextNode(fourNode);
		sixthNode.setNextNode(fifthNode);

		// Keep getting an error here. 
		Node answer = findThirdFromLast(sixthNode);
		System.out.println(answer.data);


	}

	public static Node findThirdFromLast(Node firstNode){
		Node currentNode = firstNode;
		while(!nodeSensor(3, currentNode) || !exactAmount(3, currentNode)){
			currentNode = currentNode.next;
		}
		return currentNode;
	}

	//A private helper method to 'see' what nodes lies ahead from my current spot.
	private static boolean nodeSensor(int stepsAhead, Node selNode){
		Node currentNode = selNode;
		for(int i = 1; i <= stepsAhead; i++){
			if(selNode.next == null){
				return false;
			}
			currentNode = currentNode.next;
		}
		return true;
	}

	// In the event the length of the linkedList is exactly the same as the number of nodes out we want to find. 
	private static boolean exactAmount(int stepsAhead, Node selNode){
		Node currentNode = selNode;
		for(int i = 1; i <= stepsAhead; i++){
			if(selNode.next == null && i == stepsAhead){
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}
}