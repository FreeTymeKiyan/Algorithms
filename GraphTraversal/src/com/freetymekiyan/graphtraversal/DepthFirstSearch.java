package com.freetymekiyan.graphtraversal;

/**
 * Implement depth first search for a graph.
 * 
 * @author Kiyan
 */
public class DepthFirstSearch {
	
	public static void search(GraphNode root) {
		if (root == null) {
			return;
		}
		visit(root);
		root.visited = true;
		for (GraphNode child : root.adjacent) {
			if (!child.visited) {
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