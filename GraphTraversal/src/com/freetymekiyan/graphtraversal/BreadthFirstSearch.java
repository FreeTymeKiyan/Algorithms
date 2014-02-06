package com.freetymekiyan.graphtraversal;

/**
 * Implement breadth first search for a graph. 
 * 
 * @author Kiyan
 */
public class BreadthFirstSearch {
	
	public static void search(GraphNode root) {
		if (root == null) {
			return;
		}
		visit(root);
		root.visited = true;
		Queue queue = new Queue();
		queue.enqueue(root);
		
		while (!queue.isEmpty()) {
			GraphNode r = (GraphNode) queue.dequeue();
			for(GraphNode n : r.adjacent) {
				if (!n.visited) {
					visit(n);
					n.visited = true;
					queue.enqueue(n);
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
