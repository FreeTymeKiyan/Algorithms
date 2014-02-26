package com.freetymekiyan.basicdatastructures;

import java.util.Arrays;

/**
 * Implement a queue with an array 
 * 
 * @author Kiyan
 */
public class QueueArray {
	
	Object[] queue = new Object[]{};
	
	Object dequeue() {
		if (queue.length != 0) {
			Object item = queue[1];
			queue = Arrays.copyOfRange(queue, 1, queue.length - 1);
			return item;
		}
		return null;
	}
	
	void enqueue(Object item) {
		queue = Arrays.copyOf(queue, queue.length + 1);
		queue[queue.length - 1] = item;
	}
}