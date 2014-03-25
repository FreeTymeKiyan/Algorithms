package com.freetymekiyan.basicdatastructures;

/**
 * Implementation of a singly linked list 
 * 
 * @author Kiyan
 */
public class MySinglyLinkedList {
	
	Node head = null;
	
	public MySinglyLinkedList(Object item) {
		head = new Node(item);
	}
	
	public void append(Object item) {
		Node end = new Node(item);
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
}