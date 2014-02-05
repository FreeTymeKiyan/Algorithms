package com.freetymekiyan.treetraversal;

/**
 * Pre-order traversal of a tree.
 * Root is visited before left subtree and 
 * right subtree.
 * @author Kiyan
 */
public class PreOrder {
	
	public static void traversal(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.getNodeValue());
		traversal(root.leftNode());
		traversal(root.rightNode());
	}
}
