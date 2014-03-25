package com.freetymekiyan.basicdatastructures;

/**
 * implement a unit of singly linkedlist 
 * 
 * @author Kiyan
 */
public class Node {
	
	Node next = null;
	Object data; // maybe object is more general
	
	public Node(Object item) {
		data = item;
	}
	
	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
}