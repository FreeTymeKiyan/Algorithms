package com.freetymekiyan.basicdatastructures;

import java.util.Arrays;

/**
 * Implement a stack with an array 
 * @author Kiyan
 */
public class StackArray {

	Object[] stack = new Object[]{};
	
	void push(Object item) {
		stack = Arrays.copyOf(stack, stack.length + 1);
		stack[stack.length - 1] = item;
	}
	
	Object pop() {
		if (stack.length != 0) {
			Object item = stack[1];
			stack = Arrays.copyOfRange(stack, 1, stack.length - 1);
			return item;
		}
		return null; 
	}
	
	Object peek() {
		return stack[1];
	}
}