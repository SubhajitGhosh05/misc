package com.bst;

public class Application {

	public static void main(String[] args) {
BST tree=new BST();
tree.insert(10,"Ten");
tree.insert(20,"Twenty");
tree.insert(30,"Thirty");
tree.insert(40,"Forty");
tree.insert(50,"Fifty");
//tree.inorderTraversal(tree.root);  

System.out.println(tree.findMax().key);
System.out.println(tree.findMin().key);
	}

}
