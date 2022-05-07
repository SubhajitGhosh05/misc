package ds.linedList;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 3;
		Node nodeB = new Node();
		nodeB.data = 4;
		Node nodeC = new Node();
		nodeC.data = 5;
		Node nodeD = new Node();
		nodeD.data = 6;
		
		nodeA.next=nodeB;
		nodeB.next=nodeC;
		nodeC.next=nodeD;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
		System.out.println(listLength(nodeD));
	}
	
	public static int listLength(Node snode) {
		int length=0;
		Node currentNode=snode;
		while(currentNode!=null) {
		length++;
		currentNode=currentNode.next;
		}
		return length;
		
	}

}
