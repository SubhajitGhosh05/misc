package ds.linkedList.CircularLinkedList;

public class App {
	public static void main(String[] args) {
		CircularLinkedList mylist = new CircularLinkedList();
		mylist.insertFirst(10);
		mylist.insertFirst(20);
		mylist.insertFirst(30);
		mylist.insertFirst(40);
		mylist.insertFirst(50);
		mylist.insertFirst(60);

		mylist.insertLast(1000);

		mylist.displayList();
		// mylist.deleteFirst();
		// mylist.displayList();
	}
}
