package ds.linkedList.CircularLinkedList;

import ds.linkedList.singlyLinkedList.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList() {
		super();
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // The next value of the lastNode will point to the new node
			last = newNode;// we make the newNode we created as the last one of the list
		}
	}

	public int deleteFirst() {
		int temp = first.data;
		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
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
