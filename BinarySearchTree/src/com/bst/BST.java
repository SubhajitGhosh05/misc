package com.bst;

public class BST {
private	Node root;
/*  
 * Every node has maximum two children, so binary 
 */
	public void insert(int key, String value) {
		Node newnode = new Node(key, value);
		if (root == null) { // if there is no node in tree, new node is getting created
			root = newnode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (key < current.key) {
					current = current.leftchild;
					if (current == null) { // it's parent is the leaf node
						parent.leftchild = newnode;
					}
				}

				else {
					current = current.rightchild;
					if (current == null) { // it's parent is the leaf node
						parent.rightchild = newnode;
						return;
					}
				}
			}
		}
	}
	
	/*
	 * public void inorderTraversal(Node node) {
	 * 
	 * //Check whether tree is empty if(root == null){
	 * System.out.println("Tree is empty"); return; } else {
	 * 
	 * if(node.leftchild!= null) inorderTraversal(node.leftchild);
	 * System.out.print(node.key + " "+node.value+" \n"); if(node.rightchild!= null)
	 * inorderTraversal(node.rightchild);
	 * 
	 * } }
	 */ 

	public Node findMax() {
		Node current=root;
		Node last=null;
		while(current!=null) {
			last=current;
			current=current.rightchild;
		}
		return last;
	}
	
	
	public Node findMin() {
		Node current=root;
		Node last=null;
		while(current!=null) {
			last=current;
			current=current.leftchild;
		}
		return last;
	}
	
}
