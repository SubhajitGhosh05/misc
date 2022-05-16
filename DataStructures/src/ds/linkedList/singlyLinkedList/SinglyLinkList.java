package ds.linkedList.singlyLinkedList;

public class SinglyLinkList {
	private Node first;
	private int size;

	public SinglyLinkList() {

	}

	public boolean isEmpty() {
		return (first == null);
	}

// Used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		size++;
	}
	
	public void insertLast(int data) {
		Node current = first;
		size++;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = temp.next;
		System.out.println("Delted node " + temp.data);
		size--;
		return first;
	}

	public void removeLast() {
		if (first == null) {
			System.out.println("Empty List, nothing to delete");
			return;
		}

		size--;
		if (first.next == null) {
			System.out.println("Delted node is " +first.data);
			first = null;
			return;
		}

		Node currNode = first;
		Node lastNode = first.next;
		while (lastNode.next != null) {
			currNode = currNode.next;
			lastNode = lastNode.next;
		}
		System.out.println("Delted node is " +lastNode.data);
		currNode.next = null;
	}

	public int getSize() {
		return size;
	}

	void deleteNode(int key) {
		// Store first node
		Node temp = first, prev = null;

		// If first node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			first = temp.next; // Changed first
			return;
		}

		// Search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;
		size--;
	}


	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
}
