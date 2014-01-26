package com.freetymekiyan.rebuildbinarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an input like: 
 * [2, 4] 
 * [1, 2] 
 * [3, 6] 
 * [1, 3] 
 * [2, 5] 
 * Use it to reconstruct this binary tree:
 * 			   1
 *         2      3
 *       4   5  6
 * Note: 
 * a) The first number in each line is a parent. 
 * b) Second number is a child. 
 * c) The left child always shows up in the input before the right child. 
 * 
 * Return root.
 * 
 * @author Kiyan
 *
 */
public class RebuildBinaryTree {
	
	public static void main(String[] args) {
		int[][] nodes = { { 2, 4 }, { 1, 2 }, { 3, 6 }, { 1, 3 }, { 2, 5 } };
		Map<Integer, List<Integer>> treeMap = new HashMap<Integer,List<Integer>>(); 
		Map<Integer, Integer> childParentMap = new HashMap<Integer, Integer>();
		int rootCandidate = nodes[0][0];
		for (int i = 0; i < nodes.length; i++) {
		    List<Integer> children = null;
		    if (treeMap.containsKey(nodes[i][0])) {
				children = treeMap.get(nodes[i][0]);
		    } else {
				children = new ArrayList<Integer>();
				treeMap.put(nodes[i][0], children);
		    }
		    children.add(nodes[i][1]);
		    childParentMap.put(nodes[i][1], nodes[i][0]);
		}
		while(childParentMap.containsKey(rootCandidate)) {
		    rootCandidate = childParentMap.get(rootCandidate);
		}
		System.out.println(reconstructTree(treeMap, rootCandidate).value);
	}

	public static Node reconstructTree(Map<Integer, List<Integer>> treeMap, int v) {
		Node root = new Node(v);
		if (treeMap.get(v) == null || treeMap.get(v).isEmpty()) {
			return root;
		}
		root.left = reconstructTree(treeMap, treeMap.get(v).get(0));
		if (treeMap.get(v).size() == 2) {
			root.right = reconstructTree(treeMap, treeMap.get(v).get(1));
		}
		return root;
	}
	
}

class Node {
	int value;
	Node left;
	Node right;
	
	public Node(int v) {
		value = v;
	}
	
}