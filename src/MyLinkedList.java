
public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	public Node head = null;
	// for convenience, keep track of how many items are in the list
	public int length = 0;
	
	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		// TODO #1
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		length++;
	}
	
	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		// TODO #4
		if (length ==0) {
			return; // do nothing
		}
		head = head.getNext();
		length --;
	}
	
		@Override
	public void addAtEnd(String data) {
		// TODO Exercise
		if (head == null) {
			head = new Node(data);
			length++;
			return;
		}
		else { Node node = head;
			
			while ((node.getNext() != null)) {
	           node = node.getNext();
	       }
			node.setNext(new Node(data)); 
			length++;
		}
	}
	
	
	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// TODO #5
			Node node = getNodeAt(length -2);
			node.setNext(null);
			length--;
		}
	}
	
	@Override
	public String get(int index) {
		// TODO #3
		Node node = getNodeAt(index);
		if (node == null) {
			throw new IndexOutOfBoundsException();
		} else {
		 return node.getData();
		}
	}
		
	


	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end 
		while (node != null) {
			// TODO #2
			sb.append(node);
			node = node.getNext();
		}
		return sb.toString();
	}
	
	@Override
	public int size() {
		return length;
	}
	
	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}
	
	public boolean removeAt (int index) {
		
		if (index == 0) {
			removeFromBeginning();
	           return true;
		}
		if (index == length -1) {
			removeFromEnd();
			return true;
		}
		if ((index > (length -1)) || index < 0) {
			return false;
		}
		else {
//			// This also works:	
			// Node node1 = getNodeAt( (index -1) );
			// Node node2 = getNodeAt( (index + 1) ;
			//node1.setNext(node2);
			Node node= head;
				for(int i=0; i<index-1;i++) {
					node=node.getNext();
		}
		node.next = node.next.next;
			
		length--;
		return true;
		}
	}
	
	public boolean insertAt (int index, String item) {
		
		if ( (index < 0) || (index > length) ) {
			return false;
		}
		if (index == 0) {
			addAtBeginning(item);
			return true;
		}
		if (index == length) {
			addAtEnd(item);
			return true;
		}
		
		
		else {
			
			Node node1 = getNodeAt((index-1));	
			Node node3 = getNodeAt((index));	
			Node node2 = new Node ((item));	
			node1.setNext(node2);
			node2.setNext(node3);
			length++;
			return true;
		}
			
	}

}