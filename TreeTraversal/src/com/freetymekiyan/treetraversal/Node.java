package com.freetymekiyan.treetraversal;

/**
 * Wrapper class of a tree node.
 * 
 * @author Kiyan
 */
public class Node {
	
	private Node right;
	private Node left;
	private int data;

	public Node (int d) {
		data = d;
	}

	public Node leftNode() {return left;}
	
	public void setLeftNode(Node left) {this.left = left;}
	
	public Node rightNode() {return right;}

	public void setRightNode(Node right) {this.right = right;}
	
	public int getNodeValue() {return data;}
}