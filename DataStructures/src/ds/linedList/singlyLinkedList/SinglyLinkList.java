package ds.linedList.singlyLinkedList;

public class SinglyLinkList {
	private Node first;

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
	}

	void deleteNode(int key) {
		// Store head node
		Node temp = first, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			first = temp.next; // Changed head
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
	}

	public Node deleteFirst() {
		Node temp = first;
		first = temp.next;
		System.out.println("Delted node " + temp.data);
		return first;
	}

	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

	public void displayList() {
		System.out.println("List (first --> last) ");
		Node current = first;
		while (current != null) {
			current.displayNoode();
			current = current.next;
		}
		System.out.println();
	}
}
