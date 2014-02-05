package com.freetymekiyan.basicdatastructures;

import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.empty();
		Integer peek = stack.peek();
		Integer pop = stack.pop();
		stack.push(new Integer(0));
	}
}
