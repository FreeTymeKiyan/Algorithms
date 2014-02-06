package com.freetymekiyan.graphtraversal;

/**
 * implement a Queue
 * 
 * @author Kiyan
 */
public class Queue {
	
	QueueElement first, last;
	
	public Queue() {
		
	}
	
	void enqueue(Object item) {
		if (first == null) {
			last = new QueueElement(item);
			first = last;
		} else {
			last.next = new QueueElement(item);
			last = last.next;
		}
	}
	
	Object dequeue() {
		if (first != null) {
			Object item = first.data;
			first = first.next;
			return item;
		}
		return null;
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}
}