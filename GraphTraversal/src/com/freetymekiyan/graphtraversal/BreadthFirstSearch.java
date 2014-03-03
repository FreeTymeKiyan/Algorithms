package com.freetymekiyan.graphtraversal;

/**
 * Implement breadth first search for a graph. 
 * 
 * @author Kiyan
 */
public class BreadthFirstSearch {
	
	public static void search(GraphNode root) {
		if (root == null) { // error check
			return;
		}
		visit(root); // visit 
		root.visited = true; // set visited true
		Queue queue = new Queue();
		queue.enqueue(root); // enqueue current node
		
		while (!queue.isEmpty()) {
			GraphNode r = (GraphNode) queue.dequeue(); // dequeue first node
			for(GraphNode n : r.adjacent) { // vist all adjacent nodes
				if (!n.visited) {
					visit(n);
					n.visited = true;
					queue.enqueue(n); // enqueue visited node
				}
			}
		}
	}

	private static void visit(GraphNode n) {
		if (n.value == 1) {
			// do something!
		}
	}
}
