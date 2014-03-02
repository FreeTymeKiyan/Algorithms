package com.freetymekiyan.findroute;

import java.util.LinkedList;

/**
 * Given a directed graph.
 * Find out whether there is a route 
 * between two nodes.
 * 
 * @author Kiyan
 */
public class FindRoute {
	
	/**
	 * BFS
	 * 
	 * @param g
	 * @param start
	 * @param end
	 * @return
	 */
	public static boolean findRoute(Graph g, Node start, Node end) {
		LinkedList<Node> queue = new LinkedList<Node>();
		for (Node u : g.getNodes()) {
			u.state = State.Unvisited;
		}
		start.state = State.Visiting;
		queue.add(start);
		Node u;
		while (!queue.isEmpty()) {
			u = queue.removeFirst();
			if (u != null) {
				for (Node v : u.getAdjacent()) {
					if (v == end) {
						return true;
					} else {
						v.state = State.Visiting;
						queue.add(v);
					}
				}
			}
			u.state = State.Visited;
		}
		return false;
	}
	
	public enum State {
		Unvisited, Visited, Visiting;
	}
}