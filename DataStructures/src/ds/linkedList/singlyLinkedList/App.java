package ds.linkedList.singlyLinkedList;

public class App {
	public static void main(String[] args) {
		SinglyLinkList mylist = new SinglyLinkList();
		mylist.insertFirst(10);
		mylist.insertFirst(20);
		mylist.insertFirst(30);
		mylist.insertFirst(40);
		mylist.insertFirst(50);
		mylist.insertFirst(60);

		mylist.insertLast(1000);

		mylist.displayList();
		 mylist.deleteFirst();
		 System.out.println("----------");
		mylist.displayList();
		mylist.deleteNode(30);
		System.out.println("----------");
		mylist.displayList();
	}
}
