package com.freetymekiyan.graphtraversal;

import java.util.ArrayList;

/**
 * Wrapper class of a graph node.
 * 
 * @author Kiyan
 */
public class GraphNode {
	
	boolean visited = false;
	ArrayList<GraphNode> adjacent;
	int value;
}
