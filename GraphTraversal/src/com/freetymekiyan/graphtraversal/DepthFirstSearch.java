package com.freetymekiyan.graphtraversal;

/**
 * Implement depth first search for a graph.
 * 
 * @author Kiyan
 */
public class DepthFirstSearch {
	
	public static void search(GraphNode root) {
		if (root == null) { // error check
			return;
		}
		visit(root); // visit
		root.visited = true; // set visited true
		for (GraphNode child : root.adjacent) { // search adjacent nodes
			if (!child.visited) { // avoid loops
				search(child);
			}
		}
	}

	private static void visit(GraphNode root) {
		if (root.value == 1) {
			// do something
		}
	}
}