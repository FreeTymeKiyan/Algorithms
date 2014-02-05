package com.freetymekiyan.treetraversal;

/**
 * In-order traversal of a tree.
 * Root is visited after left subtree before
 * right subtree.
 * 
 * @author Kiyan
 */
public class InOrder {
	
	public static void traversal(Node root) {
		if (root == null) {
			return;
		}
		traversal(root.leftNode());
		System.out.println(root.getNodeValue());
		traversal(root.rightNode());
	}
}
